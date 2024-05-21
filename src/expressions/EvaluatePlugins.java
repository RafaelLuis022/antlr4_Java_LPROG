package expressions;

import expressions.globalPluginsAnswersGrammar.ActionExprAnswersLexer;
import expressions.globalPluginsAnswersGrammar.EvalAnswersVisitor;
import expressions.globalPluginsAnswersGrammar.antlrAnswersGrammarParser;
import expressions.globalPluginsGrammar.ActionExprLexer;
import expressions.globalPluginsGrammar.EvalVisitor;
import expressions.globalPluginsGrammar.antlrGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaluatePlugins {

    private String toEvaluateTxtPath;
    private String allQuestionsAnswersTxtPath;

    public EvaluatePlugins(String toEvaluateTxtPath,String allQuestionsAnswersTxtPath){
        this.toEvaluateTxtPath = toEvaluateTxtPath;
        this.allQuestionsAnswersTxtPath = allQuestionsAnswersTxtPath;
    }

    public Integer evaluate() {
        try {
            // Get all the question -> answers -> value data
            Map<String,Map<String,Integer>> allQuestionsAnswersMap = retrieveAllQuestionsAnswersMap();

            // Get the candidate Question -> Answers
            Map<String, List<String>> toEvaluateMap = retrieveToEvaluateMap();

            // Return the assigned grade
            return grade(toEvaluateMap,allQuestionsAnswersMap);
        } catch (Exception e) {
            // Provide detailed exception information
            System.out.println("ERROR during evaluation: " + e.getMessage());
            e.printStackTrace();
            return -1;
        }
    }
    public Map<String, List<String>> retrieveToEvaluateMap(){

        Map<String, List<String>> tokenMap = new HashMap<>();

        try{
            ActionExprLexer lexer = new ActionExprLexer(CharStreams.fromFileName(toEvaluateTxtPath));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            antlrGrammarParser parser = new antlrGrammarParser(tokens);
            ParseTree parseTree =  parser.start();
            tokenMap = parseWithVisitor(parseTree);

        } catch (IOException e) {
            System.out.println("Error in retrieveAllQuestionsAnswersMap:"+e.getMessage());
            throw new RuntimeException(e);
        }

        return tokenMap;

    }

    public Map<String, List<String>> parseWithVisitor(ParseTree parseTree){
        EvalVisitor evalVisitor = new EvalVisitor();
        Map<String, List<String>> result;
        result = evalVisitor.visit(parseTree);
        return result;
    }

    public Map<String, Map<String,Integer>> parseWithAnswersVisitor(ParseTree parseTree){
        EvalAnswersVisitor evalAnswersVisitor = new EvalAnswersVisitor();
        Map<String, Map<String,Integer>> result;
        result = evalAnswersVisitor.visit(parseTree);
        return result;
    }

    public Map<String,Map<String,Integer>> retrieveAllQuestionsAnswersMap(){

        Map<String,Map<String,Integer>> allQuestionsAnswersMap;

        try{
            System.out.println("Absolute path:"+Path.of(allQuestionsAnswersTxtPath).toAbsolutePath());
            ActionExprAnswersLexer lexer = new ActionExprAnswersLexer(CharStreams.fromFileName(allQuestionsAnswersTxtPath));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            antlrAnswersGrammarParser parser = new antlrAnswersGrammarParser(tokens);
            ParseTree parseTree =  parser.start();
            allQuestionsAnswersMap = parseWithAnswersVisitor(parseTree);

        } catch (IOException e) {
            System.out.println("Error in retrieveAllQuestionsAnswersMap:"+e.getMessage());
            throw new RuntimeException(e);
        }

        return allQuestionsAnswersMap;

    }

    public Integer grade(Map<String, List<String>> candidateAnswersMap,Map<String, Map<String,Integer>> allquestionAnswerMap){

        int grade = 0;

        // Para cada pergunta , é verificado se exista essa pergunta no mapa que contêm todas as perguntas criadas
        for (String recievedQuestion : candidateAnswersMap.keySet()){
            if (allquestionAnswerMap.containsKey(recievedQuestion)){
                // Para cada resposta existente é verificado se essa resposta existe no mapa já mencionado
                for (String answer : candidateAnswersMap.get(recievedQuestion)){
                    if (allquestionAnswerMap.get(recievedQuestion).get(answer) != null){
                        grade += allquestionAnswerMap.get(recievedQuestion).get(answer);
                    }
                }
            }
        }

        return grade;
    }
}
