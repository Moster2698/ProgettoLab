// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArnoldCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArnoldCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ArnoldCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#main_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_function(ArnoldCParser.Main_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(ArnoldCParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ArnoldCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(ArnoldCParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#print_sconst_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_sconst_stmt(ArnoldCParser.Print_sconst_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#print_var_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_var_stmt(ArnoldCParser.Print_var_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#var_decl_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl_stmt(ArnoldCParser.Var_decl_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelseendif}
	 * labeled alternative in {@link ArnoldCParser#condition_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelseendif(ArnoldCParser.IfelseendifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifendid}
	 * labeled alternative in {@link ArnoldCParser#condition_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfendid(ArnoldCParser.IfendidContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(ArnoldCParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarexpr(ArnoldCParser.VarexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberexpr(ArnoldCParser.NumberexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueexpr(ArnoldCParser.TrueexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseexpr(ArnoldCParser.FalseexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#var_assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign_stmt(ArnoldCParser.Var_assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(ArnoldCParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusop(ArnoldCParser.PlusopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusop(ArnoldCParser.MinusopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationop(ArnoldCParser.MultiplicationopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divisionop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionop(ArnoldCParser.DivisionopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualop(ArnoldCParser.EqualopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterop(ArnoldCParser.GreateropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrop(ArnoldCParser.OropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndop(ArnoldCParser.AndopContext ctx);
}