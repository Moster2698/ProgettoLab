// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArnoldCParser}.
 */
public interface ArnoldCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArnoldCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ArnoldCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ArnoldCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCParser#main_function}.
	 * @param ctx the parse tree
	 */
	void enterMain_function(ArnoldCParser.Main_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCParser#main_function}.
	 * @param ctx the parse tree
	 */
	void exitMain_function(ArnoldCParser.Main_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ArnoldCParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ArnoldCParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ArnoldCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ArnoldCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(ArnoldCParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(ArnoldCParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCParser#print_sconst_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_sconst_stmt(ArnoldCParser.Print_sconst_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCParser#print_sconst_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_sconst_stmt(ArnoldCParser.Print_sconst_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCParser#print_var_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_var_stmt(ArnoldCParser.Print_var_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCParser#print_var_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_var_stmt(ArnoldCParser.Print_var_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCParser#var_decl_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl_stmt(ArnoldCParser.Var_decl_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCParser#var_decl_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl_stmt(ArnoldCParser.Var_decl_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelseendif}
	 * labeled alternative in {@link ArnoldCParser#condition_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfelseendif(ArnoldCParser.IfelseendifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelseendif}
	 * labeled alternative in {@link ArnoldCParser#condition_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfelseendif(ArnoldCParser.IfelseendifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifendid}
	 * labeled alternative in {@link ArnoldCParser#condition_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfendid(ArnoldCParser.IfendidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifendid}
	 * labeled alternative in {@link ArnoldCParser#condition_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfendid(ArnoldCParser.IfendidContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(ArnoldCParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(ArnoldCParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarexpr(ArnoldCParser.VarexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarexpr(ArnoldCParser.VarexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberexpr(ArnoldCParser.NumberexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberexpr(ArnoldCParser.NumberexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrueexpr(ArnoldCParser.TrueexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrueexpr(ArnoldCParser.TrueexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFalseexpr(ArnoldCParser.FalseexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFalseexpr(ArnoldCParser.FalseexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCParser#var_assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign_stmt(ArnoldCParser.Var_assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCParser#var_assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign_stmt(ArnoldCParser.Var_assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(ArnoldCParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(ArnoldCParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterPlusop(ArnoldCParser.PlusopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitPlusop(ArnoldCParser.PlusopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterMinusop(ArnoldCParser.MinusopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitMinusop(ArnoldCParser.MinusopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationop(ArnoldCParser.MultiplicationopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationop(ArnoldCParser.MultiplicationopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divisionop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterDivisionop(ArnoldCParser.DivisionopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divisionop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitDivisionop(ArnoldCParser.DivisionopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterEqualop(ArnoldCParser.EqualopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitEqualop(ArnoldCParser.EqualopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterGreaterop(ArnoldCParser.GreateropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitGreaterop(ArnoldCParser.GreateropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOrop(ArnoldCParser.OropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOrop(ArnoldCParser.OropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterAndop(ArnoldCParser.AndopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitAndop(ArnoldCParser.AndopContext ctx);
}