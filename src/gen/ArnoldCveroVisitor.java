// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArnoldCveroParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArnoldCveroVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArnoldCveroParser#arnoldProg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldProg(ArnoldCveroParser.ArnoldProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCveroParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(ArnoldCveroParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCveroParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ArnoldCveroParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCveroParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(ArnoldCveroParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCveroParser#print_sconst_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_sconst_stmt(ArnoldCveroParser.Print_sconst_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCveroParser#print_var_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_var_stmt(ArnoldCveroParser.Print_var_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCveroParser#var_decl_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl_stmt(ArnoldCveroParser.Var_decl_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelseendif}
	 * labeled alternative in {@link ArnoldCveroParser#condition_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelseendif(ArnoldCveroParser.IfelseendifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifendid}
	 * labeled alternative in {@link ArnoldCveroParser#condition_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfendid(ArnoldCveroParser.IfendidContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCveroParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(ArnoldCveroParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varexpr}
	 * labeled alternative in {@link ArnoldCveroParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarexpr(ArnoldCveroParser.VarexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberexpr}
	 * labeled alternative in {@link ArnoldCveroParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberexpr(ArnoldCveroParser.NumberexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueexpr}
	 * labeled alternative in {@link ArnoldCveroParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueexpr(ArnoldCveroParser.TrueexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseexpr}
	 * labeled alternative in {@link ArnoldCveroParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseexpr(ArnoldCveroParser.FalseexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCveroParser#var_assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign_stmt(ArnoldCveroParser.Var_assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCveroParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(ArnoldCveroParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusop(ArnoldCveroParser.PlusopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusop(ArnoldCveroParser.MinusopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationop(ArnoldCveroParser.MultiplicationopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divisionop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionop(ArnoldCveroParser.DivisionopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualop(ArnoldCveroParser.EqualopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterop(ArnoldCveroParser.GreateropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrop(ArnoldCveroParser.OropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndop(ArnoldCveroParser.AndopContext ctx);
}