package compiler;

import compiler.models.*;
import compiler.models.Class;
import compiler.models.Error;
import gen.MoolaListener;
import gen.MoolaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SymbolTableGenerator implements MoolaListener {

    private Scope currentScope;

    ArrayList<Error> errors = new ArrayList<>();

    @Override
    public void enterProgram(MoolaParser.ProgramContext ctx) {
        currentScope = new Scope("Program", ctx.getStart().getLine(), null);
    }

    @Override
    public void exitProgram(MoolaParser.ProgramContext ctx) {
        while (currentScope.parent != null) currentScope = currentScope.parent;

        printTree(currentScope);

        for (Error e :
                errors) {
            System.out.println(e.toString());
        }
    }

    private void printTree(Scope scope) {
        System.out.println("-------------- " + scope.name + " : " + scope.lineNumber + " --------------");
        for (Map.Entry<String, TableRow> row : scope.table.entrySet()) {
            System.out.println("Key = " + row.getKey() + " | Value = " + row.getValue().getText());
        }
        System.out.println("----------------------------------------\n");
        for (Scope child : scope.children) {
            printTree(child);
        }
    }

    @Override
    public void enterClassDeclaration(MoolaParser.ClassDeclarationContext ctx) {
        boolean isMainClass = ctx.getParent() instanceof MoolaParser.EntryClassDeclarationContext;
        String parentClass = "Any";
        if (ctx.classParent != null)
            parentClass = ctx.classParent.getText();

        if (currentScope.table.containsKey("class_" + ctx.className.getText())) {
            int line = ctx.start.getLine();
            int column = ctx.className.getCharPositionInLine();

            currentScope.table.put("class_" + ctx.className.getText() + "_" + line + "_" + column,
                    new Class(ctx.className.getText(), parentClass, isMainClass));
            errors.add(
                    new Error(101, line, column, "class " + ctx.className.getText() + " has been defined already")
            );
        } else {
            currentScope.table.put("class_" + ctx.className.getText(),
                    new Class(ctx.className.getText(), parentClass, isMainClass));
        }
        currentScope = new Scope("Class: " + ctx.className.getText(), ctx.getStart().getLine(), currentScope);
    }

    @Override
    public void exitClassDeclaration(MoolaParser.ClassDeclarationContext ctx) {
        currentScope = currentScope.parent;
    }

    @Override
    public void enterEntryClassDeclaration(MoolaParser.EntryClassDeclarationContext ctx) {
    }

    @Override
    public void exitEntryClassDeclaration(MoolaParser.EntryClassDeclarationContext ctx) {
    }

    @Override
    public void enterFieldDeclaration(MoolaParser.FieldDeclarationContext ctx) {
        String accessModifier = "private";
        if (ctx.fieldAccessModifier != null)
            accessModifier = ctx.fieldAccessModifier.getText();

        List<TerminalNode> ids = ctx.ID();
        for (TerminalNode id : ids) {
            if(currentScope.table.containsKey("field_" + id.toString())) {
                int line = ctx.start.getLine();
                int column = id.getSymbol().getCharPositionInLine();
                currentScope.table.put("field_" + id.toString() + id.toString() + "_" + line + "_" + column, new Field(id.toString(), ctx.fieldType.getText(), accessModifier));
                errors.add(
                        new Error(103, line, column, "field " + id.toString() + " has been defined already")
                );
            }
            else {
                currentScope.table.put("field_" + id.toString(), new Field(id.toString(), ctx.fieldType.getText(), accessModifier));
            }
        }
    }

    @Override
    public void exitFieldDeclaration(MoolaParser.FieldDeclarationContext ctx) {

    }

    @Override
    public void enterAccess_modifier(MoolaParser.Access_modifierContext ctx) {

    }

    @Override
    public void exitAccess_modifier(MoolaParser.Access_modifierContext ctx) {

    }

    @Override
    public void enterMethodDeclaration(MoolaParser.MethodDeclarationContext ctx) {
        StringBuilder type = new StringBuilder();
        ArrayList<String> paramTypes = new ArrayList<>();
        ArrayList<String> paramNames = new ArrayList<>();
        if (ctx.param1 != null) {
//            paramTypes.add(ctx.typeP1.getText());
            List<MoolaParser.MoolaTypeContext> inputs = ctx.moolaType();
            List<TerminalNode> names = ctx.ID();
            for (int i = 0; i < inputs.size() - 1; i++) { //param2 s
                paramTypes.add(inputs.get(i).st.getText());
                paramNames.add(names.get(i + 1).getSymbol().getText());
            }
        }

        String accessModifier = "public";
        if (ctx.methodAccessModifier != null)
            accessModifier = ctx.methodAccessModifier.getText();

        if(currentScope.table.containsKey("method_" + ctx.methodName.getText())){
            ArrayList<String> savedParams = ((Method)currentScope.table.get("method_" + ctx.methodName.getText())).getParametersType();

            boolean same = true;
            for (int i = 0; i < savedParams.size(); i++) {
                if(!paramTypes.get(i).equals(savedParams.get(i))){
                    same = false;
                    break;
                }
            }
            if(same && paramTypes.size() == savedParams.size()){
                int line = ctx.start.getLine();
                int column = ctx.methodName.getCharPositionInLine();

                currentScope.table.put("method_" + ctx.methodName.getText() + "_" + line + "_" + column,
                        new Method(ctx.methodName.getText(), ctx.t.getText(), accessModifier, paramTypes));

                errors.add(
                        new Error(102, line, column, "method " + ctx.methodName.getText() + " has been defined already")
                );
            }
            else{
                currentScope.table.put("method_" + ctx.methodName.getText(),
                        new Method(ctx.methodName.getText(), ctx.t.getText(), accessModifier, paramTypes));
            }
        }
        else {
            currentScope.table.put("method_" + ctx.methodName.getText(),
                    new Method(ctx.methodName.getText(), ctx.t.getText(), accessModifier, paramTypes));
        }
        currentScope = new Scope("Method: " + ctx.methodName.getText(), ctx.getStart().getLine(), currentScope);
        for (int i = 0; i < paramNames.size(); i++) {
            currentScope.table.put("input_" + paramNames.get(i), new MethodInput(paramNames.get(i), paramTypes.get(i)));
        }
    }

    @Override
    public void exitMethodDeclaration(MoolaParser.MethodDeclarationContext ctx) {
        currentScope = currentScope.parent;
    }

    @Override
    public void enterClosedStatement(MoolaParser.ClosedStatementContext ctx) {
        if (ctx.getParent() instanceof MoolaParser.ClosedConditionalContext) {
            MoolaParser.ClosedConditionalContext p = (MoolaParser.ClosedConditionalContext) ctx.getParent();
            if (p.ifStat == ctx)
                currentScope = new Scope("if", ctx.getStart().getLine(), currentScope);
            else if (p.elifStat == ctx)
                currentScope = new Scope("elif", ctx.getStart().getLine(), currentScope);
            else
                currentScope = new Scope("else", ctx.getStart().getLine(), currentScope);
        } else if (ctx.getParent() instanceof MoolaParser.OpenConditionalContext) {
            MoolaParser.OpenConditionalContext p = (MoolaParser.OpenConditionalContext) ctx.getParent();
            if (p.secondIfStat == ctx)
                currentScope = new Scope("if", ctx.getStart().getLine(), currentScope);
            else if (p.closedStatement().subList(1, p.closedStatement().size()).contains(ctx))
                currentScope = new Scope("elif", ctx.getStart().getLine(), currentScope);
            else if (p.thirdIfStat == ctx)
                currentScope = new Scope("if", ctx.getStart().getLine(), currentScope);
        }
    }

    @Override
    public void exitClosedStatement(MoolaParser.ClosedStatementContext ctx) {
        if (ctx.getParent() instanceof MoolaParser.ClosedConditionalContext ||
                ctx.getParent() instanceof MoolaParser.OpenConditionalContext
                ) {
            currentScope = currentScope.parent;
        }
    }

    @Override
    public void enterClosedConditional(MoolaParser.ClosedConditionalContext ctx) {
    }

    @Override
    public void exitClosedConditional(MoolaParser.ClosedConditionalContext ctx) {

    }

    @Override
    public void enterOpenConditional(MoolaParser.OpenConditionalContext ctx) {

    }

    @Override
    public void exitOpenConditional(MoolaParser.OpenConditionalContext ctx) {

    }

    @Override
    public void enterOpenStatement(MoolaParser.OpenStatementContext ctx) {
        if (ctx.getParent() instanceof MoolaParser.OpenConditionalContext) {
            MoolaParser.OpenConditionalContext p = (MoolaParser.OpenConditionalContext) ctx.getParent();
            if (p.elseStmt == ctx)
                currentScope = new Scope("else", ctx.getStart().getLine(), currentScope);
        }
    }

    @Override
    public void exitOpenStatement(MoolaParser.OpenStatementContext ctx) {
        if (ctx.getParent() instanceof MoolaParser.OpenConditionalContext) {
            currentScope = currentScope.parent;
        }
    }

    @Override
    public void enterStatement(MoolaParser.StatementContext ctx) {
        if (ctx.getParent() instanceof MoolaParser.OpenConditionalContext) {
            MoolaParser.OpenConditionalContext p = (MoolaParser.OpenConditionalContext) ctx.getParent();
            if (p.ifStat == ctx)
                currentScope = new Scope("if", ctx.getStart().getLine(), currentScope);
            else if (p.lastElifStmt == ctx)
                currentScope = new Scope("elif", ctx.getStart().getLine(), currentScope);
        }
    }

    @Override
    public void exitStatement(MoolaParser.StatementContext ctx) {
        if (ctx.getParent() instanceof MoolaParser.OpenConditionalContext) {
            currentScope = currentScope.parent;
        }
    }

    @Override
    public void enterStatementVarDef(MoolaParser.StatementVarDefContext ctx) {
        List<TerminalNode> ids = ctx.ID();
        for (TerminalNode id : ids) {

            if(currentScope.table.containsKey("var_" + id.toString())) {
                int line = ctx.start.getLine();
                int column = id.getSymbol().getCharPositionInLine();
                currentScope.table.put("var_" + id.toString() + "_" + line + "_" + column, new Var(id.toString()));
                errors.add(
                        new Error(103, line, column, "var " + id.toString() + " has been defined already")
                );
            }
            else {
                currentScope.table.put("var_" + id.toString(), new Var(id.toString()));
            }
        }
    }

    @Override
    public void exitStatementVarDef(MoolaParser.StatementVarDefContext ctx) {

    }

    @Override
    public void enterStatementBlock(MoolaParser.StatementBlockContext ctx) {
        ParserRuleContext grandparent = ctx.getParent().getParent();
        if (grandparent instanceof MoolaParser.StatementClosedLoopContext ||
                grandparent instanceof MoolaParser.ClosedConditionalContext ||
                grandparent instanceof MoolaParser.OpenConditionalContext
                ) return;
        currentScope = new Scope("Block", ctx.getStart().getLine(), currentScope);
    }

    @Override
    public void exitStatementBlock(MoolaParser.StatementBlockContext ctx) {
        ParserRuleContext grandparent = ctx.getParent().getParent();
        if (grandparent instanceof MoolaParser.StatementClosedLoopContext ||
                grandparent instanceof MoolaParser.ClosedConditionalContext ||
                grandparent instanceof MoolaParser.OpenConditionalContext
                ) return;
        currentScope = currentScope.parent;
    }

    @Override
    public void enterStatementContinue(MoolaParser.StatementContinueContext ctx) {

    }

    @Override
    public void exitStatementContinue(MoolaParser.StatementContinueContext ctx) {

    }

    @Override
    public void enterStatementBreak(MoolaParser.StatementBreakContext ctx) {

    }

    @Override
    public void exitStatementBreak(MoolaParser.StatementBreakContext ctx) {

    }

    @Override
    public void enterStatementReturn(MoolaParser.StatementReturnContext ctx) {

    }

    @Override
    public void exitStatementReturn(MoolaParser.StatementReturnContext ctx) {

    }

    @Override
    public void enterStatementClosedLoop(MoolaParser.StatementClosedLoopContext ctx) {
        currentScope = new Scope("While", ctx.getStart().getLine(), currentScope);
    }

    @Override
    public void exitStatementClosedLoop(MoolaParser.StatementClosedLoopContext ctx) {
        currentScope = currentScope.parent;
    }

    @Override
    public void enterStatementOpenLoop(MoolaParser.StatementOpenLoopContext ctx) {
        currentScope = new Scope("While", ctx.getStart().getLine(), currentScope);
    }

    @Override
    public void exitStatementOpenLoop(MoolaParser.StatementOpenLoopContext ctx) {
        currentScope = currentScope.parent;
    }

    @Override
    public void enterStatementWrite(MoolaParser.StatementWriteContext ctx) {

    }

    @Override
    public void exitStatementWrite(MoolaParser.StatementWriteContext ctx) {

    }

    @Override
    public void enterStatementAssignment(MoolaParser.StatementAssignmentContext ctx) {

    }

    @Override
    public void exitStatementAssignment(MoolaParser.StatementAssignmentContext ctx) {

    }

    @Override
    public void enterStatementInc(MoolaParser.StatementIncContext ctx) {

    }

    @Override
    public void exitStatementInc(MoolaParser.StatementIncContext ctx) {

    }

    @Override
    public void enterStatementDec(MoolaParser.StatementDecContext ctx) {

    }

    @Override
    public void exitStatementDec(MoolaParser.StatementDecContext ctx) {

    }

    @Override
    public void enterExpression(MoolaParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(MoolaParser.ExpressionContext ctx) {

    }

    @Override
    public void enterExpressionOr(MoolaParser.ExpressionOrContext ctx) {

    }

    @Override
    public void exitExpressionOr(MoolaParser.ExpressionOrContext ctx) {

    }

    @Override
    public void enterExpressionOrTemp(MoolaParser.ExpressionOrTempContext ctx) {

    }

    @Override
    public void exitExpressionOrTemp(MoolaParser.ExpressionOrTempContext ctx) {

    }

    @Override
    public void enterExpressionAnd(MoolaParser.ExpressionAndContext ctx) {

    }

    @Override
    public void exitExpressionAnd(MoolaParser.ExpressionAndContext ctx) {

    }

    @Override
    public void enterExpressionAndTemp(MoolaParser.ExpressionAndTempContext ctx) {

    }

    @Override
    public void exitExpressionAndTemp(MoolaParser.ExpressionAndTempContext ctx) {

    }

    @Override
    public void enterExpressionEq(MoolaParser.ExpressionEqContext ctx) {

    }

    @Override
    public void exitExpressionEq(MoolaParser.ExpressionEqContext ctx) {

    }

    @Override
    public void enterExpressionEqTemp(MoolaParser.ExpressionEqTempContext ctx) {

    }

    @Override
    public void exitExpressionEqTemp(MoolaParser.ExpressionEqTempContext ctx) {

    }

    @Override
    public void enterExpressionCmp(MoolaParser.ExpressionCmpContext ctx) {

    }

    @Override
    public void exitExpressionCmp(MoolaParser.ExpressionCmpContext ctx) {

    }

    @Override
    public void enterExpressionCmpTemp(MoolaParser.ExpressionCmpTempContext ctx) {

    }

    @Override
    public void exitExpressionCmpTemp(MoolaParser.ExpressionCmpTempContext ctx) {

    }

    @Override
    public void enterExpressionAdd(MoolaParser.ExpressionAddContext ctx) {

    }

    @Override
    public void exitExpressionAdd(MoolaParser.ExpressionAddContext ctx) {

    }

    @Override
    public void enterExpressionAddTemp(MoolaParser.ExpressionAddTempContext ctx) {

    }

    @Override
    public void exitExpressionAddTemp(MoolaParser.ExpressionAddTempContext ctx) {

    }

    @Override
    public void enterExpressionMultMod(MoolaParser.ExpressionMultModContext ctx) {

    }

    @Override
    public void exitExpressionMultMod(MoolaParser.ExpressionMultModContext ctx) {

    }

    @Override
    public void enterExpressionMultModTemp(MoolaParser.ExpressionMultModTempContext ctx) {

    }

    @Override
    public void exitExpressionMultModTemp(MoolaParser.ExpressionMultModTempContext ctx) {

    }

    @Override
    public void enterExpressionUnary(MoolaParser.ExpressionUnaryContext ctx) {

    }

    @Override
    public void exitExpressionUnary(MoolaParser.ExpressionUnaryContext ctx) {

    }

    @Override
    public void enterExpressionMethods(MoolaParser.ExpressionMethodsContext ctx) {

    }

    @Override
    public void exitExpressionMethods(MoolaParser.ExpressionMethodsContext ctx) {

    }

    @Override
    public void enterExpressionMethodsTemp(MoolaParser.ExpressionMethodsTempContext ctx) {

    }

    @Override
    public void exitExpressionMethodsTemp(MoolaParser.ExpressionMethodsTempContext ctx) {

    }

    @Override
    public void enterExpressionOther(MoolaParser.ExpressionOtherContext ctx) {

    }

    @Override
    public void exitExpressionOther(MoolaParser.ExpressionOtherContext ctx) {

    }

    @Override
    public void enterMoolaType(MoolaParser.MoolaTypeContext ctx) {

    }

    @Override
    public void exitMoolaType(MoolaParser.MoolaTypeContext ctx) {

    }

    @Override
    public void enterSingleType(MoolaParser.SingleTypeContext ctx) {

    }

    @Override
    public void exitSingleType(MoolaParser.SingleTypeContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
