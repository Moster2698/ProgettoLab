// Generated from /Users/alessio/Code/HaveFunProject/src/ArnoldC.g4 by ANTLR 4.12.0
package gen;
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
	 * Enter a parse tree produced by the {@code arnoldIfElse}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIfElse(ArnoldCParser.ArnoldIfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldIfElse}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIfElse(ArnoldCParser.ArnoldIfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldIf}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIf(ArnoldCParser.ArnoldIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldIf}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIf(ArnoldCParser.ArnoldIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldWhile}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldWhile(ArnoldCParser.ArnoldWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldWhile}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldWhile(ArnoldCParser.ArnoldWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldPrintExp}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldPrintExp(ArnoldCParser.ArnoldPrintExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldPrintExp}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldPrintExp(ArnoldCParser.ArnoldPrintExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldAssign}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldAssign(ArnoldCParser.ArnoldAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldAssign}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldAssign(ArnoldCParser.ArnoldAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldDeclare}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldDeclare(ArnoldCParser.ArnoldDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldDeclare}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldDeclare(ArnoldCParser.ArnoldDeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldPlus}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterArnoldPlus(ArnoldCParser.ArnoldPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldPlus}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitArnoldPlus(ArnoldCParser.ArnoldPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldMinus}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterArnoldMinus(ArnoldCParser.ArnoldMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldMinus}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitArnoldMinus(ArnoldCParser.ArnoldMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldMultiplication}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterArnoldMultiplication(ArnoldCParser.ArnoldMultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldMultiplication}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitArnoldMultiplication(ArnoldCParser.ArnoldMultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldDivision}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterArnoldDivision(ArnoldCParser.ArnoldDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldDivision}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitArnoldDivision(ArnoldCParser.ArnoldDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldEqual}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterArnoldEqual(ArnoldCParser.ArnoldEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldEqual}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitArnoldEqual(ArnoldCParser.ArnoldEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldGreater}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterArnoldGreater(ArnoldCParser.ArnoldGreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldGreater}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitArnoldGreater(ArnoldCParser.ArnoldGreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldOr}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterArnoldOr(ArnoldCParser.ArnoldOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldOr}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitArnoldOr(ArnoldCParser.ArnoldOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldAnd}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterArnoldAnd(ArnoldCParser.ArnoldAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldAnd}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitArnoldAnd(ArnoldCParser.ArnoldAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldIdexpr}
	 * labeled alternative in {@link ArnoldCParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIdexpr(ArnoldCParser.ArnoldIdexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldIdexpr}
	 * labeled alternative in {@link ArnoldCParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIdexpr(ArnoldCParser.ArnoldIdexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldString}
	 * labeled alternative in {@link ArnoldCParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterArnoldString(ArnoldCParser.ArnoldStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldString}
	 * labeled alternative in {@link ArnoldCParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitArnoldString(ArnoldCParser.ArnoldStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldNumberexpr}
	 * labeled alternative in {@link ArnoldCParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterArnoldNumberexpr(ArnoldCParser.ArnoldNumberexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldNumberexpr}
	 * labeled alternative in {@link ArnoldCParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitArnoldNumberexpr(ArnoldCParser.ArnoldNumberexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldBoolExp}
	 * labeled alternative in {@link ArnoldCParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterArnoldBoolExp(ArnoldCParser.ArnoldBoolExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldBoolExp}
	 * labeled alternative in {@link ArnoldCParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitArnoldBoolExp(ArnoldCParser.ArnoldBoolExpContext ctx);
}