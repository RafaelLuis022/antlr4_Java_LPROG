// Generated from C:/Users/HP/Desktop/lapr4/lprog/antlr4_Java_LPROG/src/expressions/globalPluginsGrammar/antlrGrammar.g4 by ANTLR 4.13.1
package expressions.globalPluginsGrammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link antlrGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface antlrGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(antlrGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#listOfQuestions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfQuestions(antlrGrammarParser.ListOfQuestionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#questions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestions(antlrGrammarParser.QuestionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#question_tf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_tf(antlrGrammarParser.Question_tfContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#question_timehour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_timehour(antlrGrammarParser.Question_timehourContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#question_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_date(antlrGrammarParser.Question_dateContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#question_numericalscale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_numericalscale(antlrGrammarParser.Question_numericalscaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#question_decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_decimal(antlrGrammarParser.Question_decimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#question_integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_integer(antlrGrammarParser.Question_integerContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#question_shorttext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_shorttext(antlrGrammarParser.Question_shorttextContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#question_multiplechoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_multiplechoice(antlrGrammarParser.Question_multiplechoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#question_singlechoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_singlechoice(antlrGrammarParser.Question_singlechoiceContext ctx);
}