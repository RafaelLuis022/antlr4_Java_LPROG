// Generated from C:/Users/rafae/Ambiente de Trabalho/uni/2Ano_2semestre/LPROG/ANTLR/antlr4/src/expressions/antlrGrammar.g4 by ANTLR 4.13.1
package expressions;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link antlrGrammarParser}.
 */
public interface antlrGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(antlrGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(antlrGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#listOfQQuestionsAns}.
	 * @param ctx the parse tree
	 */
	void enterListOfQQuestionsAns(antlrGrammarParser.ListOfQQuestionsAnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#listOfQQuestionsAns}.
	 * @param ctx the parse tree
	 */
	void exitListOfQQuestionsAns(antlrGrammarParser.ListOfQQuestionsAnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#questionAnswer}.
	 * @param ctx the parse tree
	 */
	void enterQuestionAnswer(antlrGrammarParser.QuestionAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#questionAnswer}.
	 * @param ctx the parse tree
	 */
	void exitQuestionAnswer(antlrGrammarParser.QuestionAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(antlrGrammarParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(antlrGrammarParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrGrammarParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswer(antlrGrammarParser.AnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrGrammarParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswer(antlrGrammarParser.AnswerContext ctx);
}