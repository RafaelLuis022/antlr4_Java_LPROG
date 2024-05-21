// Generated from C:/Users/rafae/Ambiente de Trabalho/uni/2Ano_2semestre/LPROG/ANTLR/antlr4/src/expressions/globalPluginsAnswersGrammar/antlrAnswersGrammar.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link antlrAnswersGrammarParser#answers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswers(antlrAnswersGrammarParser.AnswersContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrAnswersGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(antlrAnswersGrammarParser.TypeContext ctx);
}