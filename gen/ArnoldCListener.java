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
	 * Enter a parse tree produced by {@link ArnoldCParser#arnoldIni}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIni(ArnoldCParser.ArnoldIniContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCParser#arnoldIni}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIni(ArnoldCParser.ArnoldIniContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArnoldCParser#coms}.
	 * @param ctx the parse tree
	 */
	void enterComs(ArnoldCParser.ComsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArnoldCParser#coms}.
	 * @param ctx the parse tree
	 */
	void exitComs(ArnoldCParser.ComsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldIFElse}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIFElse(ArnoldCParser.ArnoldIFElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldIFElse}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIFElse(ArnoldCParser.ArnoldIFElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldIF}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIF(ArnoldCParser.ArnoldIFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldIF}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIF(ArnoldCParser.ArnoldIFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldWhile}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void enterArnoldWhile(ArnoldCParser.ArnoldWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldWhile}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void exitArnoldWhile(ArnoldCParser.ArnoldWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldPrintID}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void enterArnoldPrintID(ArnoldCParser.ArnoldPrintIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldPrintID}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void exitArnoldPrintID(ArnoldCParser.ArnoldPrintIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldPrintString}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void enterArnoldPrintString(ArnoldCParser.ArnoldPrintStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldPrintString}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void exitArnoldPrintString(ArnoldCParser.ArnoldPrintStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldAssign}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void enterArnoldAssign(ArnoldCParser.ArnoldAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldAssign}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void exitArnoldAssign(ArnoldCParser.ArnoldAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldDECLARE}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void enterArnoldDECLARE(ArnoldCParser.ArnoldDECLAREContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldDECLARE}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void exitArnoldDECLARE(ArnoldCParser.ArnoldDECLAREContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldID}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArnoldID(ArnoldCParser.ArnoldIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldID}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArnoldID(ArnoldCParser.ArnoldIDContext ctx);
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