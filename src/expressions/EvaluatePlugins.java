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
import java.util.*;

public class EvaluatePlugins {

    private String toEvaluateTxtPath;
    private String allQuestionsAnswersTxtPath;

    private Map<String,Boolean> questionsRightOrWrong = new HashMap<>();

    private final Map<String, String> errorMap = Map.of("errorcode", "-1");

    public EvaluatePlugins(String toEvaluateTxtPath, String allQuestionsAnswersTxtPath) {
        this.toEvaluateTxtPath = toEvaluateTxtPath;
        this.allQuestionsAnswersTxtPath = allQuestionsAnswersTxtPath;
    }

    public Map<String,String> evaluate() {
        try {
            Map<String, Map<String, Integer>> allQuestionsAnswersMap = retrieveAllQuestionsAnswersMap();
            Map<String, List<String>> toEvaluateMap = retrieveToEvaluateMap();
            if (!areQuestionsEqual(allQuestionsAnswersMap, toEvaluateMap)) {
                System.out.println(areQuestionsEqual(allQuestionsAnswersMap, toEvaluateMap));
                System.out.println("Questions are not equal");
                return errorMap;
            }
            return getFeedback(grade(toEvaluateMap, allQuestionsAnswersMap), allQuestionsAnswersMap);
        } catch (Exception e) {

            System.out.println("ERROR during evaluation: " + e.getMessage());
            return errorMap;
        }
    }

    private Map<String, String> getFeedback(Integer grade, Map<String, Map<String, Integer>> criteria) {
        Map<String, String> feedback = new LinkedHashMap<>();
        StringBuilder details = new StringBuilder();
        Integer correctAnswersCount = 0;

        for (String question : questionsRightOrWrong.keySet()) {
            boolean isCorrect = questionsRightOrWrong.get(question);
            details.append(question).append(" : ").append(isCorrect ? "Correct" : "Incorrect").append("\n");
            if (isCorrect) {
                correctAnswersCount++;
            }
        }

        String minCorrectAnswersStr = criteria.get("criteria_q").get("criteria_q") == -1 ? "n/a" : criteria.get("criteria_q").get("criteria_q").toString();
        String minGradeStr = criteria.get("criteria_grademin").get("criteria_grademin") == -1 ? "n/a" : criteria.get("criteria_grademin").get("criteria_grademin").toString();

        Integer minCorrectAnswers = criteria.get("criteria_q").get("criteria_q");
        Integer minGrade = criteria.get("criteria_grademin").get("criteria_grademin");

        feedback.put("Evaluation Report", details.toString());
        feedback.put("Grade", grade.toString());
        feedback.put("Minimum Grade", minGradeStr);
        feedback.put("Correct Answers", correctAnswersCount.toString());
        feedback.put("Minimum Correct Answers", minCorrectAnswersStr);

        if (!minCorrectAnswersStr.equals("n/a")) {
            feedback.put("Correct Answers Evaluation", correctAnswersCount >= minCorrectAnswers ? "Met the minimum" : "Did not meet the minimum");
        } else {
            feedback.put("Correct Answers Comparison", "n/a");
        }

        if (!minGradeStr.equals("n/a")) {
            feedback.put("Grade Evaluation", grade >= minGrade ? "Met the minimum" : "Did not meet the minimum");
        } else {
            feedback.put("Grade Evaluation", "n/a");
        }

        return feedback;
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
                for (String candidateAnswer : candidateAnswersMap.get(receivedQuestion)) {
                    for (String respostaCorreta : allquestionAnswerMap.get(receivedQuestion).keySet()) {
                        if (candidateAnswer.contains(respostaCorreta)) {
                            questionsRightOrWrong.put(receivedQuestion, true);
                            grade += allquestionAnswerMap.get(receivedQuestion).get(respostaCorreta);
                            break;
                        }else{
                            questionsRightOrWrong.put(receivedQuestion, false);
                        }
                    }
                }
            }
        }
        return grade;
    }


    public boolean areQuestionsEqual(Map<String, Map<String, Integer>> map1, Map<String, List<String>> map2) {

        List<String> questions1 = new ArrayList<>();
        for (String question : map1.keySet()) {
            if(!question.startsWith("criteria_")){
                questions1.add(question);
            }

        }
        List<String> questions2 = new ArrayList<>(map2.keySet());
        return questions1.equals(questions2);
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
