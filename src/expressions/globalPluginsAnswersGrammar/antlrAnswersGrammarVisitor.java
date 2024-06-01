// Generated from C:/Users/HP/Desktop/lapr4/lprog/antlr4_Java_LPROG/src/expressions/globalPluginsAnswersGrammar/antlrAnswersGrammar.g4 by ANTLR 4.13.1
package expressions.globalPluginsAnswersGrammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link antlrAnswersGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface antlrAnswersGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link antlrAnswersGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(antlrAnswersGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrAnswersGrammarParser#listOfQuestions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfQuestions(antlrAnswersGrammarParser.ListOfQuestionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrAnswersGrammarParser#questions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestions(antlrAnswersGrammarParser.QuestionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrAnswersGrammarParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriteria(antlrAnswersGrammarParser.CriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrAnswersGrammarParser#question_tf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_tf(antlrAnswersGrammarParser.Question_tfContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrAnswersGrammarParser#question_timehour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_timehour(antlrAnswersGrammarParser.Question_timehourContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrAnswersGrammarParser#question_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_date(antlrAnswersGrammarParser.Question_dateContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrAnswersGrammarParser#question_numericalscale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_numericalscale(antlrAnswersGrammarParser.Question_numericalscaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrAnswersGrammarParser#question_decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_decimal(antlrAnswersGrammarParser.Question_decimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrAnswersGrammarParser#question_integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_integer(antlrAnswersGrammarParser.Question_integerContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrAnswersGrammarParser#question_shorttext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_shorttext(antlrAnswersGrammarParser.Question_shorttextContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrAnswersGrammarParser#question_multiplechoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_multiplechoice(antlrAnswersGrammarParser.Question_multiplechoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrAnswersGrammarParser#question_singlechoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_singlechoice(antlrAnswersGrammarParser.Question_singlechoiceContext ctx);
}