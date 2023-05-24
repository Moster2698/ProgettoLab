// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArnoldCveroParser}.
 */
public interface ArnoldCveroListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArnoldCveroParser#arnoldProg}.
	 * @param ctx the parse tree
	 */
	void enterArnoldProg(ArnoldCveroParser.ArnoldProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCveroParser#arnoldProg}.
	 * @param ctx the parse tree
	 */
	void exitArnoldProg(ArnoldCveroParser.ArnoldProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCveroParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ArnoldCveroParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCveroParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ArnoldCveroParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCveroParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ArnoldCveroParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCveroParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ArnoldCveroParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCveroParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(ArnoldCveroParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCveroParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(ArnoldCveroParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCveroParser#print_sconst_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_sconst_stmt(ArnoldCveroParser.Print_sconst_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCveroParser#print_sconst_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_sconst_stmt(ArnoldCveroParser.Print_sconst_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCveroParser#print_var_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_var_stmt(ArnoldCveroParser.Print_var_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCveroParser#print_var_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_var_stmt(ArnoldCveroParser.Print_var_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCveroParser#var_decl_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl_stmt(ArnoldCveroParser.Var_decl_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCveroParser#var_decl_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl_stmt(ArnoldCveroParser.Var_decl_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelseendif}
	 * labeled alternative in {@link ArnoldCveroParser#condition_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfelseendif(ArnoldCveroParser.IfelseendifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelseendif}
	 * labeled alternative in {@link ArnoldCveroParser#condition_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfelseendif(ArnoldCveroParser.IfelseendifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifendid}
	 * labeled alternative in {@link ArnoldCveroParser#condition_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfendid(ArnoldCveroParser.IfendidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifendid}
	 * labeled alternative in {@link ArnoldCveroParser#condition_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfendid(ArnoldCveroParser.IfendidContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCveroParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(ArnoldCveroParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCveroParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(ArnoldCveroParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varexpr}
	 * labeled alternative in {@link ArnoldCveroParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarexpr(ArnoldCveroParser.VarexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varexpr}
	 * labeled alternative in {@link ArnoldCveroParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarexpr(ArnoldCveroParser.VarexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberexpr}
	 * labeled alternative in {@link ArnoldCveroParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberexpr(ArnoldCveroParser.NumberexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberexpr}
	 * labeled alternative in {@link ArnoldCveroParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberexpr(ArnoldCveroParser.NumberexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueexpr}
	 * labeled alternative in {@link ArnoldCveroParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrueexpr(ArnoldCveroParser.TrueexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueexpr}
	 * labeled alternative in {@link ArnoldCveroParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrueexpr(ArnoldCveroParser.TrueexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseexpr}
	 * labeled alternative in {@link ArnoldCveroParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFalseexpr(ArnoldCveroParser.FalseexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseexpr}
	 * labeled alternative in {@link ArnoldCveroParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFalseexpr(ArnoldCveroParser.FalseexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCveroParser#var_assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign_stmt(ArnoldCveroParser.Var_assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCveroParser#var_assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign_stmt(ArnoldCveroParser.Var_assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCveroParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(ArnoldCveroParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCveroParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(ArnoldCveroParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterPlusop(ArnoldCveroParser.PlusopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitPlusop(ArnoldCveroParser.PlusopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterMinusop(ArnoldCveroParser.MinusopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitMinusop(ArnoldCveroParser.MinusopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationop(ArnoldCveroParser.MultiplicationopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationop(ArnoldCveroParser.MultiplicationopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divisionop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterDivisionop(ArnoldCveroParser.DivisionopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divisionop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitDivisionop(ArnoldCveroParser.DivisionopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterEqualop(ArnoldCveroParser.EqualopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitEqualop(ArnoldCveroParser.EqualopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterGreaterop(ArnoldCveroParser.GreateropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitGreaterop(ArnoldCveroParser.GreateropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOrop(ArnoldCveroParser.OropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOrop(ArnoldCveroParser.OropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterAndop(ArnoldCveroParser.AndopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andop}
	 * labeled alternative in {@link ArnoldCveroParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitAndop(ArnoldCveroParser.AndopContext ctx);
}