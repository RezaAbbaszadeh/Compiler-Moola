package compiler;

import compiler.models.*;
import compiler.models.Class;
import gen.MoolaListener;
import gen.MoolaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SymbolTableGenerator implements MoolaListener {

    private Scope currentScope = new Scope("Program", null);

    @Override
    public void enterProgram(MoolaParser.ProgramContext ctx) {
    }

    @Override
    public void exitProgram(MoolaParser.ProgramContext ctx) {
        while (currentScope.parent != null) currentScope = currentScope.parent;

        printTree(currentScope);
    }

    private void printTree(Scope scope) {
        System.out.println("------------ " + scope.name + " ------------");
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

        currentScope.table.put("class_" + ctx.className.getText(),
                new Class(ctx.className.getText(), parentClass, isMainClass));
        currentScope = new Scope("Class: " + ctx.className.getText(), currentScope);
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
            currentScope.table.put("field_" + id.toString(), new Field(id.toString(), ctx.fieldType.getText()));
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
        if (ctx.param1 != null) {
            paramTypes.add(ctx.typeP1.getText());
            List<MoolaParser.MoolaTypeContext> inputs = ctx.moolaType();
            for (int i = 1; i < inputs.size() - 1; i++) { //param2 s
                paramTypes.add(inputs.get(i).st.getText());
            }
        }

        String accessModifier = "public";
        if (ctx.methodAccessModifier != null)
            accessModifier = ctx.methodAccessModifier.getText();

        currentScope.table.put("method_" + ctx.methodName.getText(),
                new Method(ctx.methodName.getText(), ctx.t.getText(), accessModifier, paramTypes));
        currentScope = new Scope("Method: " + ctx.methodName.getText(), currentScope);
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
                currentScope = new Scope("if", currentScope);
            else if (p.elifStat == ctx)
                currentScope = new Scope("elif", currentScope);
            else
                currentScope = new Scope("else", currentScope);
        } else if (ctx.getParent() instanceof MoolaParser.OpenConditionalContext) {
            MoolaParser.OpenConditionalContext p = (MoolaParser.OpenConditionalContext) ctx.getParent();
            if (p.secondIfStat == ctx)
                currentScope = new Scope("if", currentScope);
            else if (p.closedStatement().subList(1, p.closedStatement().size()).contains(ctx))
                currentScope = new Scope("elif", currentScope);
            else if (p.thirdIfStat == ctx)
                currentScope = new Scope("if", currentScope);
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
                currentScope = new Scope("else", currentScope);
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
                currentScope = new Scope("if", currentScope);
            else if (p.lastElifStmt == ctx)
                currentScope = new Scope("elif", currentScope);
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
            currentScope.table.put("var_" + id.toString(), new Var(id.toString()));
        }
    }

    @Override
    public void exitStatementVarDef(MoolaParser.StatementVarDefContext ctx) {

    }

    @Override
    public void enterStatementBlock(MoolaParser.StatementBlockContext ctx) {
        ParserRuleContext grandparent = ctx.getParent().getParent();
        if(grandparent instanceof MoolaParser.StatementClosedLoopContext ||
                grandparent instanceof MoolaParser.ClosedConditionalContext ||
                grandparent instanceof MoolaParser.OpenConditionalContext
                ) return;
        currentScope = new Scope("Block", currentScope);
    }

    @Override
    public void exitStatementBlock(MoolaParser.StatementBlockContext ctx) {
        ParserRuleContext grandparent = ctx.getParent().getParent();
        if(grandparent instanceof MoolaParser.StatementClosedLoopContext ||
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
        currentScope = new Scope("While", currentScope);
    }

    @Override
    public void exitStatementClosedLoop(MoolaParser.StatementClosedLoopContext ctx) {
        currentScope = currentScope.parent;
    }

    @Override
    public void enterStatementOpenLoop(MoolaParser.StatementOpenLoopContext ctx) {
        currentScope = new Scope("While", currentScope);
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
