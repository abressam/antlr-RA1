// Generated from Arithmetic.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmeticParser}.
 */
public interface ArithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ArithmeticParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ArithmeticParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ArithmeticParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ArithmeticParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ArithmeticParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ArithmeticParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(ArithmeticParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(ArithmeticParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ArithmeticParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ArithmeticParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(ArithmeticParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(ArithmeticParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#nonzero}.
	 * @param ctx the parse tree
	 */
	void enterNonzero(ArithmeticParser.NonzeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#nonzero}.
	 * @param ctx the parse tree
	 */
	void exitNonzero(ArithmeticParser.NonzeroContext ctx);
}