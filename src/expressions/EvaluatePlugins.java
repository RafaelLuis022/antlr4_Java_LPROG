package expressions;

import expressions.globalPluginsAnswersGrammar.ActionExprAnswersLexer;
import expressions.globalPluginsAnswersGrammar.EvalAnswersVisitor;
import expressions.globalPluginsAnswersGrammar.antlrAnswersGrammarParser;
import expressions.globalPluginsGrammar.ActionExprLexer;
import expressions.globalPluginsGrammar.EvalVisitor;
import expressions.globalPluginsGrammar.antlrGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaluatePlugins {

    private String toEvaluateTxtPath;
    private String allQuestionsAnswersTxtPath;

    public EvaluatePlugins(String toEvaluateTxtPath, String allQuestionsAnswersTxtPath) {
        this.toEvaluateTxtPath = toEvaluateTxtPath;
        this.allQuestionsAnswersTxtPath = allQuestionsAnswersTxtPath;
    }

    public Integer evaluate() {
        try {

            Map<String, Map<String, Integer>> allQuestionsAnswersMap = retrieveAllQuestionsAnswersMap();


            Map<String, List<String>> toEvaluateMap = retrieveToEvaluateMap();

            if (!areQuestionsEqual(allQuestionsAnswersMap, toEvaluateMap)) {
                System.out.println("Questions are not equal");
                return -1;
            }


            return grade(toEvaluateMap, allQuestionsAnswersMap);
        } catch (Exception e) {

            System.out.println("ERROR during evaluation: " + e.getMessage());
            e.printStackTrace();
            return -1;
        }
    }

    public Map<String, List<String>> retrieveToEvaluateMap() {
        Map<String, List<String>> tokenMap = new HashMap<>();
        try {
            String input = Files.readString(Paths.get(toEvaluateTxtPath));
            if (!isSyntaxCorrect(input, true)) {
                throw new RuntimeException("Syntax error in toEvaluateTxt file");
            }

            ActionExprLexer lexer = new ActionExprLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            antlrGrammarParser parser = new antlrGrammarParser(tokens);
            ParseTree parseTree = parser.start();
            tokenMap = parseWithVisitor(parseTree);
        } catch (IOException e) {
            System.out.println("Error in retrieveToEvaluateMap: " + e.getMessage());
            throw new RuntimeException(e);
        }

        return tokenMap;
    }

    public Map<String, List<String>> parseWithVisitor(ParseTree parseTree) {
        EvalVisitor evalVisitor = new EvalVisitor();
        return evalVisitor.visit(parseTree);
    }

    public Map<String, Map<String, Integer>> parseWithAnswersVisitor(ParseTree parseTree) {
        EvalAnswersVisitor evalAnswersVisitor = new EvalAnswersVisitor();
        return evalAnswersVisitor.visit(parseTree);
    }

    public Map<String, Map<String, Integer>> retrieveAllQuestionsAnswersMap() {
        Map<String, Map<String, Integer>> allQuestionsAnswersMap;
        try {
            String input = Files.readString(Paths.get(allQuestionsAnswersTxtPath));
            if (!isSyntaxCorrect(input, false)) {
                throw new RuntimeException("Syntax error in allQuestionsAnswersTxt file");
            }

            ActionExprAnswersLexer lexer = new ActionExprAnswersLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            antlrAnswersGrammarParser parser = new antlrAnswersGrammarParser(tokens);
            ParseTree parseTree = parser.start();
            allQuestionsAnswersMap = parseWithAnswersVisitor(parseTree);
        } catch (IOException e) {
            System.out.println("Error in retrieveAllQuestionsAnswersMap: " + e.getMessage());
            throw new RuntimeException(e);
        }

        return allQuestionsAnswersMap;
    }

    public Integer grade(Map<String, List<String>> candidateAnswersMap, Map<String, Map<String, Integer>> allquestionAnswerMap) {
        int grade = 0;

        for (String receivedQuestion : candidateAnswersMap.keySet()) {
            if (allquestionAnswerMap.containsKey(receivedQuestion)) {

                for (String answer : candidateAnswersMap.get(receivedQuestion)) {
                    if (allquestionAnswerMap.get(receivedQuestion).get(answer) != null) {
                        grade += allquestionAnswerMap.get(receivedQuestion).get(answer);
                    }
                }
            }
        }
        return grade;
    }

    public boolean areQuestionsEqual(Map<String, Map<String, Integer>> map1, Map<String, List<String>> map2) {
        return map1.keySet().equals(map2.keySet());
    }


    private   boolean isSyntaxCorrect(String input, boolean isEvaluationFile) {
        CharStream charStream = CharStreams.fromString(input);
        if (isEvaluationFile) {
            ActionExprLexer lexer = new ActionExprLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            antlrGrammarParser parser = new antlrGrammarParser(tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(new SyntaxErrorListener());

            try {
                parser.start();
                return true;
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
                return false;
            }
        } else {
            ActionExprAnswersLexer lexer = new ActionExprAnswersLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            antlrAnswersGrammarParser parser = new antlrAnswersGrammarParser(tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(new SyntaxErrorListener());

            try {
                parser.start();
                return true;
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
                return false;
            }
        }
    }

    public boolean isSyntaxCorrect() {

        // verifica se a sintaxe do arquivo de respostas está correta e do arquivo de avaliação
        try {
            String input = Files.readString(Paths.get(allQuestionsAnswersTxtPath));
            if (!isSyntaxCorrect(input, false)) {
                return false;
            }

            input = Files.readString(Paths.get(toEvaluateTxtPath));
            if (!isSyntaxCorrect(input, true)) {
                return false;
            }
        } catch (IOException e) {
            System.out.println("Error in isSyntaxCorrect: " + e.getMessage());
            throw new RuntimeException(e);
        }
        return areQuestionsEqual(retrieveAllQuestionsAnswersMap(), retrieveToEvaluateMap());

    }


}
