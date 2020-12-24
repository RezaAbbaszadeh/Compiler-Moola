package gen;// Generated from E:/uni/7/projects/Moola/grammar\Moola.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MoolaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MoolaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MoolaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MoolaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(MoolaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#entryClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryClassDeclaration(MoolaParser.EntryClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(MoolaParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#access_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modifier(MoolaParser.Access_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(MoolaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#closedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosedStatement(MoolaParser.ClosedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#closedConditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosedConditional(MoolaParser.ClosedConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#openConditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenConditional(MoolaParser.OpenConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#openStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenStatement(MoolaParser.OpenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MoolaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#statementVarDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementVarDef(MoolaParser.StatementVarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(MoolaParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#statementContinue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementContinue(MoolaParser.StatementContinueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#statementBreak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBreak(MoolaParser.StatementBreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#statementReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturn(MoolaParser.StatementReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#statementClosedLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementClosedLoop(MoolaParser.StatementClosedLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#statementOpenLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementOpenLoop(MoolaParser.StatementOpenLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#statementWrite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWrite(MoolaParser.StatementWriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#statementAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment(MoolaParser.StatementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#statementInc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementInc(MoolaParser.StatementIncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#statementDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDec(MoolaParser.StatementDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MoolaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expressionOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOr(MoolaParser.ExpressionOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expressionOrTemp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOrTemp(MoolaParser.ExpressionOrTempContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expressionAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAnd(MoolaParser.ExpressionAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expressionAndTemp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAndTemp(MoolaParser.ExpressionAndTempContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expressionEq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionEq(MoolaParser.ExpressionEqContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expressionEqTemp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionEqTemp(MoolaParser.ExpressionEqTempContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expressionCmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionCmp(MoolaParser.ExpressionCmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expressionCmpTemp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionCmpTemp(MoolaParser.ExpressionCmpTempContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expressionAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAdd(MoolaParser.ExpressionAddContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expressionAddTemp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAddTemp(MoolaParser.ExpressionAddTempContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expressionMultMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMultMod(MoolaParser.ExpressionMultModContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expressionMultModTemp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMultModTemp(MoolaParser.ExpressionMultModTempContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expressionUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionUnary(MoolaParser.ExpressionUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expressionMethods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMethods(MoolaParser.ExpressionMethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expressionMethodsTemp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMethodsTemp(MoolaParser.ExpressionMethodsTempContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#expressionOther}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOther(MoolaParser.ExpressionOtherContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#moolaType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoolaType(MoolaParser.MoolaTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MoolaParser#singleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleType(MoolaParser.SingleTypeContext ctx);
}