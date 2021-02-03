package compiler;

import compiler.models.Class;
import compiler.models.Error;
import compiler.models.Method;
import gen.MoolaListener;
import gen.MoolaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Hashtable;

public class ErrorFinder implements MoolaListener {

    static ArrayList<Error> errors = new ArrayList<>();
    static ArrayList<Class> classes = new ArrayList<>();
    private Scope currentScope;

    ErrorFinder(Scope rootNode) {
        this.currentScope = rootNode;
    }

    void searchScope(String name, int lineNumber) {
        for (Scope child :
                currentScope.children) {
            if (child.name.equals(name) && child.lineNumber == lineNumber) {
                currentScope = child;
                break;
            }
        }
    }

    private Boolean classExists(String className) {
        for (Class c :
                classes) {
            if (c.getName().equals(className))
                return true;
        }
        return false;
    }

    @Override
    public void enterProgram(MoolaParser.ProgramContext ctx) {

        classes.add(new Class("Any", "", false));
//        Iterator<String> it = currentScope.table.keySet().iterator();
//        while (it.hasNext()) {
//            String key = it.next();
//            if (key.startsWith("class_")) {
//                classes.add(key.substring(key.indexOf("_") + 1));
//            }
//        }

        currentScope.table.forEach((k, v) -> {
            if (k.startsWith("class_")) {
                classes.add((Class) v);
            }
        });

        for (Class c :
                classes) {
            ArrayList<Class> parents = new ArrayList<>();
            Class p = (Class) currentScope.table.getOrDefault("class_" + c.getParentClass(), null);
            boolean repeated = false;
            StringBuilder heir = new StringBuilder(c.getName());
            while (p != null) {
                for (Class parent : parents) {
                    if (parent.equals(p)) {
                        int line = 0;
                        for (Scope s :
                                currentScope.children) {
                            if (s.name.equals("Class: " + c.getName())) {
                                line = s.lineNumber;
                            }
                        }
                        errors.add(
                                new Error(410, line, 0, "Invalid inheritance " + heir)
                        );
                        repeated = true;
                        break;
                    }
                }
                if (repeated) {
                    break;
                }
                parents.add(p);

                heir.append(" -> ").append(p.getName());
                p = (Class) currentScope.table.getOrDefault("class_" + p.getParentClass(), null);
            }
        }


/*
        System.out.println(classes.size());
        for (int i = 0; i < classes.size(); i++) {
            System.out.println(classes.get(i));
        }*/

    }

    @Override
    public void exitProgram(MoolaParser.ProgramContext ctx) {
        for (Error e :
                errors) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void enterClassDeclaration(MoolaParser.ClassDeclarationContext ctx) {
        Class x = (Class) currentScope.table.get("class_" + ctx.className.getText());

        searchScope("Class: " + x.getName(), ctx.getStart().getLine());
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
        Method x = (Method) currentScope.table.get("method_" + ctx.methodName.getText());

        searchScope("Method: " + x.getName(), ctx.getStart().getLine());
    }

    @Override
    public void exitMethodDeclaration(MoolaParser.MethodDeclarationContext ctx) {
        currentScope = currentScope.parent;
    }

    @Override
    public void enterClosedStatement(MoolaParser.ClosedStatementContext ctx) {
        String name = "";
        if (ctx.getParent() instanceof MoolaParser.ClosedConditionalContext) {
            MoolaParser.ClosedConditionalContext p = (MoolaParser.ClosedConditionalContext) ctx.getParent();
            if (p.ifStat == ctx)
                name = "if";
            else if (p.elifStat == ctx)
                name = "elif";
            else
                name = "else";
            searchScope(name, ctx.getStart().getLine());
        } else if (ctx.getParent() instanceof MoolaParser.OpenConditionalContext) {
            MoolaParser.OpenConditionalContext p = (MoolaParser.OpenConditionalContext) ctx.getParent();
            if (p.secondIfStat == ctx)
                name = "if";
            else if (p.closedStatement().subList(1, p.closedStatement().size()).contains(ctx))
                name = "elif";
            else if (p.thirdIfStat == ctx)
                name = "if";
            searchScope(name, ctx.getStart().getLine());
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
            if (p.elseStmt == ctx) {
                searchScope("else", ctx.getStart().getLine());
            }
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
        String name = "";
        if (ctx.getParent() instanceof MoolaParser.OpenConditionalContext) {
            MoolaParser.OpenConditionalContext p = (MoolaParser.OpenConditionalContext) ctx.getParent();
            if (p.ifStat == ctx) {
                name = "if";
                searchScope(name, ctx.getStart().getLine());
            } else if (p.lastElifStmt == ctx) {
                name = "elif";
                searchScope(name, ctx.getStart().getLine());
            }
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
        searchScope("Block", ctx.getStart().getLine());
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
        searchScope("While", ctx.getStart().getLine());
    }

    @Override
    public void exitStatementClosedLoop(MoolaParser.StatementClosedLoopContext ctx) {
        currentScope = currentScope.parent;
    }

    @Override
    public void enterStatementOpenLoop(MoolaParser.StatementOpenLoopContext ctx) {
        searchScope("While", ctx.getStart().getLine());
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
        if (ctx.i1 != null) {
            int line = ctx.start.getLine();
            int column = ctx.i1.getCharPositionInLine();

            boolean found = false;
            // check parents in Tree
            Scope tmp = currentScope;
            while (tmp != null) {
                if (tmp.table.containsKey("var_" + ctx.i1.getText()) ||
                        tmp.table.containsKey("field_" + ctx.i1.getText()) ||
                        tmp.table.containsKey("input_" + ctx.i1.getText())
                        ) {
                    found = true;
                    return;
                }
                tmp = tmp.parent;
            }

            // check inherited parents
            Scope classScope = currentScope;
            while (!classScope.name.startsWith("Class: ")) {
                classScope = classScope.parent;
            }
            String className = classScope.name.substring(7);
            classScope = classScope.parent;
            Class c = (Class) classScope.table.get("class_" + className);

            ArrayList<Class> parents = new ArrayList<>();
            Class p = (Class) classScope.table.getOrDefault("class_" + c.getParentClass(), null);
            boolean repeated = false;


            while (p != null) {
                Hashtable parentTable = null;
                for (Scope scope :
                        classScope.children) {
                    if (scope.name.equals("Class: " + p.getName())) {
                        parentTable = scope.table;
                        break;
                    }
                }
                if (parentTable.containsKey("field_" + ctx.i1.getText())) {
                    found = true;
                    return;
                }

                for (Class parent : parents) {
                    if (parent.equals(p)) {
                        repeated = true;
                        break;
                    }
                }
                if (repeated) {
                    break;
                }

                parents.add(p);
                p = (Class) classScope.table.getOrDefault("class_" + p.getParentClass(), null);
            }

            if (!found) {
                errors.add(
                        new Error(106, line, column, "in line " + line + ":" + column + ", Can not find Variable " + ctx.i1.getText())
                );
            }
        } else if (ctx.i != null) {
            if (!classExists(ctx.i.getText())) {
                int line = ctx.start.getLine();
                int column = ctx.i.getCharPositionInLine();
                errors.add(new Error(105, line, column, "cannot find class " + ctx.i.getText()));
            }
        } else if (ctx.i3 != null) {
            int line = ctx.start.getLine();
            int column = ctx.i3.getCharPositionInLine();

            boolean found = false;
            // check parents in Tree
            Scope tmp = currentScope;
            while (tmp != null) {
                if (tmp.table.containsKey("method_" + ctx.i3.getText())) {
                    found = true;
                    return;
                }
                tmp = tmp.parent;
            }

            // check inherited parents
            Scope classScope = currentScope;
            while (!classScope.name.startsWith("Class: ")) {
                classScope = classScope.parent;
            }
            String className = classScope.name.substring(7);
            classScope = classScope.parent;
            Class c = (Class) classScope.table.get("class_" + className);

            ArrayList<Class> parents = new ArrayList<>();
            Class p = (Class) classScope.table.getOrDefault("class_" + c.getParentClass(), null);
            boolean repeated = false;


            while (p != null) {
                Hashtable parentTable = null;
                for (Scope scope :
                        classScope.children) {
                    if (scope.name.equals("Class: " + p.getName())) {
                        parentTable = scope.table;
                        break;
                    }
                }
                if (parentTable.containsKey("method_" + ctx.i3.getText())) {
                    found = true;
                    return;
                }

                for (Class parent : parents) {
                    if (parent.equals(p)) {
                        repeated = true;
                        break;
                    }
                }
                if (repeated) {
                    break;
                }

                parents.add(p);
                p = (Class) classScope.table.getOrDefault("class_" + p.getParentClass(), null);
            }

            if (!found) {
                errors.add(
                        new Error(107, line, column, "in line " + line + ":" + column + ", Can not find Method " + ctx.i3.getText())
                );
            }

        }

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
        if (ctx.i != null) {
            if (!classExists(ctx.i.getText())) {
                int line = ctx.start.getLine();
                int column = ctx.i.getCharPositionInLine();
                errors.add(new Error(105, line, column, "cannot find class " + ctx.i.getText()));
            }
        }
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
