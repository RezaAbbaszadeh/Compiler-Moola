package gen;// Generated from E:/uni/7/projects/Moola/grammar\Moola.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MoolaParser}.
 */
public interface MoolaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MoolaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MoolaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MoolaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MoolaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MoolaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#entryClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEntryClassDeclaration(MoolaParser.EntryClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#entryClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEntryClassDeclaration(MoolaParser.EntryClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(MoolaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(MoolaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_modifier(MoolaParser.Access_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_modifier(MoolaParser.Access_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MoolaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MoolaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#closedStatement}.
	 * @param ctx the parse tree
	 */
	void enterClosedStatement(MoolaParser.ClosedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#closedStatement}.
	 * @param ctx the parse tree
	 */
	void exitClosedStatement(MoolaParser.ClosedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#closedConditional}.
	 * @param ctx the parse tree
	 */
	void enterClosedConditional(MoolaParser.ClosedConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#closedConditional}.
	 * @param ctx the parse tree
	 */
	void exitClosedConditional(MoolaParser.ClosedConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#openConditional}.
	 * @param ctx the parse tree
	 */
	void enterOpenConditional(MoolaParser.OpenConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#openConditional}.
	 * @param ctx the parse tree
	 */
	void exitOpenConditional(MoolaParser.OpenConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#openStatement}.
	 * @param ctx the parse tree
	 */
	void enterOpenStatement(MoolaParser.OpenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#openStatement}.
	 * @param ctx the parse tree
	 */
	void exitOpenStatement(MoolaParser.OpenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MoolaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MoolaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#statementVarDef}.
	 * @param ctx the parse tree
	 */
	void enterStatementVarDef(MoolaParser.StatementVarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#statementVarDef}.
	 * @param ctx the parse tree
	 */
	void exitStatementVarDef(MoolaParser.StatementVarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(MoolaParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(MoolaParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#statementContinue}.
	 * @param ctx the parse tree
	 */
	void enterStatementContinue(MoolaParser.StatementContinueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#statementContinue}.
	 * @param ctx the parse tree
	 */
	void exitStatementContinue(MoolaParser.StatementContinueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#statementBreak}.
	 * @param ctx the parse tree
	 */
	void enterStatementBreak(MoolaParser.StatementBreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#statementBreak}.
	 * @param ctx the parse tree
	 */
	void exitStatementBreak(MoolaParser.StatementBreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#statementReturn}.
	 * @param ctx the parse tree
	 */
	void enterStatementReturn(MoolaParser.StatementReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#statementReturn}.
	 * @param ctx the parse tree
	 */
	void exitStatementReturn(MoolaParser.StatementReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#statementClosedLoop}.
	 * @param ctx the parse tree
	 */
	void enterStatementClosedLoop(MoolaParser.StatementClosedLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#statementClosedLoop}.
	 * @param ctx the parse tree
	 */
	void exitStatementClosedLoop(MoolaParser.StatementClosedLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#statementOpenLoop}.
	 * @param ctx the parse tree
	 */
	void enterStatementOpenLoop(MoolaParser.StatementOpenLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#statementOpenLoop}.
	 * @param ctx the parse tree
	 */
	void exitStatementOpenLoop(MoolaParser.StatementOpenLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#statementWrite}.
	 * @param ctx the parse tree
	 */
	void enterStatementWrite(MoolaParser.StatementWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#statementWrite}.
	 * @param ctx the parse tree
	 */
	void exitStatementWrite(MoolaParser.StatementWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#statementAssignment}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment(MoolaParser.StatementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#statementAssignment}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment(MoolaParser.StatementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#statementInc}.
	 * @param ctx the parse tree
	 */
	void enterStatementInc(MoolaParser.StatementIncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#statementInc}.
	 * @param ctx the parse tree
	 */
	void exitStatementInc(MoolaParser.StatementIncContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#statementDec}.
	 * @param ctx the parse tree
	 */
	void enterStatementDec(MoolaParser.StatementDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#statementDec}.
	 * @param ctx the parse tree
	 */
	void exitStatementDec(MoolaParser.StatementDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MoolaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MoolaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expressionOr}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOr(MoolaParser.ExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expressionOr}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOr(MoolaParser.ExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expressionOrTemp}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOrTemp(MoolaParser.ExpressionOrTempContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expressionOrTemp}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOrTemp(MoolaParser.ExpressionOrTempContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expressionAnd}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAnd(MoolaParser.ExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expressionAnd}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAnd(MoolaParser.ExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expressionAndTemp}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAndTemp(MoolaParser.ExpressionAndTempContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expressionAndTemp}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAndTemp(MoolaParser.ExpressionAndTempContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expressionEq}.
	 * @param ctx the parse tree
	 */
	void enterExpressionEq(MoolaParser.ExpressionEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expressionEq}.
	 * @param ctx the parse tree
	 */
	void exitExpressionEq(MoolaParser.ExpressionEqContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expressionEqTemp}.
	 * @param ctx the parse tree
	 */
	void enterExpressionEqTemp(MoolaParser.ExpressionEqTempContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expressionEqTemp}.
	 * @param ctx the parse tree
	 */
	void exitExpressionEqTemp(MoolaParser.ExpressionEqTempContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expressionCmp}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCmp(MoolaParser.ExpressionCmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expressionCmp}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCmp(MoolaParser.ExpressionCmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expressionCmpTemp}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCmpTemp(MoolaParser.ExpressionCmpTempContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expressionCmpTemp}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCmpTemp(MoolaParser.ExpressionCmpTempContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expressionAdd}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAdd(MoolaParser.ExpressionAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expressionAdd}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAdd(MoolaParser.ExpressionAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expressionAddTemp}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAddTemp(MoolaParser.ExpressionAddTempContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expressionAddTemp}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAddTemp(MoolaParser.ExpressionAddTempContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expressionMultMod}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMultMod(MoolaParser.ExpressionMultModContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expressionMultMod}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMultMod(MoolaParser.ExpressionMultModContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expressionMultModTemp}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMultModTemp(MoolaParser.ExpressionMultModTempContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expressionMultModTemp}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMultModTemp(MoolaParser.ExpressionMultModTempContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expressionUnary}.
	 * @param ctx the parse tree
	 */
	void enterExpressionUnary(MoolaParser.ExpressionUnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expressionUnary}.
	 * @param ctx the parse tree
	 */
	void exitExpressionUnary(MoolaParser.ExpressionUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expressionMethods}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMethods(MoolaParser.ExpressionMethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expressionMethods}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMethods(MoolaParser.ExpressionMethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expressionMethodsTemp}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMethodsTemp(MoolaParser.ExpressionMethodsTempContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expressionMethodsTemp}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMethodsTemp(MoolaParser.ExpressionMethodsTempContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#expressionOther}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOther(MoolaParser.ExpressionOtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#expressionOther}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOther(MoolaParser.ExpressionOtherContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#moolaType}.
	 * @param ctx the parse tree
	 */
	void enterMoolaType(MoolaParser.MoolaTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#moolaType}.
	 * @param ctx the parse tree
	 */
	void exitMoolaType(MoolaParser.MoolaTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MoolaParser#singleType}.
	 * @param ctx the parse tree
	 */
	void enterSingleType(MoolaParser.SingleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MoolaParser#singleType}.
	 * @param ctx the parse tree
	 */
	void exitSingleType(MoolaParser.SingleTypeContext ctx);
}