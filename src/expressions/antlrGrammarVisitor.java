// Generated from C:/Users/rafae/Ambiente de Trabalho/uni/2Ano_2semestre/LPROG/ANTLR/antlr4/src/expressions/antlrGrammar.g4 by ANTLR 4.13.1
package expressions;
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
	 * Visit a parse tree produced by {@link antlrGrammarParser#listOfQQuestionsAns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfQQuestionsAns(antlrGrammarParser.ListOfQQuestionsAnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#questionAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionAnswer(antlrGrammarParser.QuestionAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(antlrGrammarParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrGrammarParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer(antlrGrammarParser.AnswerContext ctx);
}