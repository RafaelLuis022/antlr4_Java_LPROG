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
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class BasePlugin {

    private String toEvaluateTxtPath;

    private String rightAnswersTxtPath;

    private final String MET_THE_MINIMUM_MSG = "Met the minimum";

    private final String DIT_NOT_MET_THE_MINIMUM_MSG = "Did not meet the minimum";

    private  Map<String,List<String>> toEvaluateSymbolTable;

    private Map<String,Map<String,Integer>> rightAnswersSymbolTable;

    public BasePlugin(String toEvaluateTxt, String rightAnswersTxt) {
        this.toEvaluateTxtPath = toEvaluateTxt;
        this.rightAnswersTxtPath = rightAnswersTxt;
    }

    //function to get the symbol table of the toEvaluateTxtPath, if there is a syntax error, it will throw an exception
    private Map<String, List<String>> getToEvaluateSymbolTable() throws IOException {

        if(toEvaluateSymbolTable == null){
            String input = Files.readString(Paths.get(toEvaluateTxtPath));
            ActionExprLexer lexer = new ActionExprLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            antlrGrammarParser parser = new antlrGrammarParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new SyntaxErrorListener(toEvaluateTxtPath));
            ParseTree parseTree = parser.start();
            EvalVisitor evalVisitor = new EvalVisitor();
            toEvaluateSymbolTable = evalVisitor.visit(parseTree);
        }

        return toEvaluateSymbolTable;
    }
    // function to get the symbol table of the rightAnswersTxtPath, if there is a syntax error, it will throw an exception
    private Map<String, Map<String, Integer>> getRightAnswersSymbolTable() throws IOException {
            if(rightAnswersSymbolTable == null){

                String input = Files.readString(Paths.get(rightAnswersTxtPath));
                ActionExprAnswersLexer lexer = new ActionExprAnswersLexer(CharStreams.fromString(input));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                antlrAnswersGrammarParser parser = new antlrAnswersGrammarParser(tokens);
                parser.removeErrorListeners();
                parser.addErrorListener(new SyntaxErrorListener(rightAnswersTxtPath));
                ParseTree parseTree = parser.start();
                EvalAnswersVisitor evalAnswersVisitor = new EvalAnswersVisitor();
                rightAnswersSymbolTable = evalAnswersVisitor.visit(parseTree);
            }
            return rightAnswersSymbolTable;
    }

    private boolean areQuestionsEqual(Map<String, Map<String, Integer>> rightAnswers, Map<String, List<String>> toEvaluateAnswers) {
        List<String> questions1 = rightAnswers.keySet().stream()
                .filter(question -> !question.startsWith("criteria_")) // remove criteria because it is not a question
                .collect(Collectors.toList());
        List<String> questions2 = new ArrayList<>(toEvaluateAnswers.keySet());
        return questions1.equals(questions2);
    }

    private boolean isCriteriaCorrect(Map<String, Map<String, Integer>> rightAnswers) {
        Map<String, Integer> criteriaQuestion = rightAnswers.get("criteria_q");
        Map<String, Integer> criteriaGrade = rightAnswers.get("criteria_grademin");

        int numberOfQuestions = (int) rightAnswers.keySet().stream()
                .filter(key -> !key.startsWith("criteria_"))
                .count();

        int maxgrade = rightAnswers.entrySet().stream()
                .filter(entry -> !entry.getKey().startsWith("criteria_"))
                .flatMapToInt(entry -> entry.getValue().values().stream().mapToInt(Integer::intValue))
                .sum();

        if (criteriaQuestion.get("criteria_q") > numberOfQuestions) {
            throw new RuntimeException("Error: total questions right must not be more than the minimum("+numberOfQuestions+")! Check criteria_q!");
        }
        if (criteriaGrade.get("criteria_grademin") > maxgrade) {
            throw new RuntimeException("Error: minimum grade must not be more than the minimum("+maxgrade+")! Check criteria_grade_min!");
        }
        return true;
    }


    //function to check if the syntax of the toEvaluateTxtPath and rightAnswersTxtPath is correct, if there is a syntax error, it will return false
    public boolean isSyntaxCorrect() {
        try {
            isCriteriaCorrect(getRightAnswersSymbolTable());
            if(!areQuestionsEqual( getRightAnswersSymbolTable(),getToEvaluateSymbolTable())){
                throw new RuntimeException("Error: questions are not equal! Please make sure that the questions are the same.");
            }
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage()); // print the error message to standard error, so if the programmer who use this plugin wants to redirect the error message to a file, they can do so
            return false;
        }
    }

    public Map<String,String> evaluate() {
        try {
            if(!isSyntaxCorrect()){
                return Map.of("errorcode","-1");
            }

            return getFeedback();
        } catch (Exception e) {

            System.err.println("ERROR during evaluation: " + e.getMessage());
            return Map.of("errorcode","-1");
        }
    }
    private Map<String,String> getFeedback() throws IOException {
        Map<String,Map<String,Integer>> rightAnswersSymbolTable = getRightAnswersSymbolTable();
        Map<String,String> feedBackMap = grade(getToEvaluateSymbolTable(),rightAnswersSymbolTable);
        Map<String,Integer> criteriaQuestion = rightAnswersSymbolTable.get("criteria_q");
        Map<String,Integer> criteriaGrade = rightAnswersSymbolTable.get("criteria_grademin");
        feedBackMap.put("Minimum Correct Answers",criteriaQuestion.get("criteria_q") == -1?"n/a":criteriaQuestion.get("criteria_q").toString());
        feedBackMap.put("Minimum Grade",criteriaGrade.get("criteria_grademin") == -1?"n/a":criteriaGrade.get("criteria_grademin").toString());
        String gradeComparation = "n/a", correctAnswersComparation = "n/a";
        if(feedBackMap.get("Minimum Grade") != "n/a"){
             gradeComparation = Integer.valueOf(feedBackMap.get("Grade")) >= Integer.valueOf(feedBackMap.get("Minimum Grade")) ? MET_THE_MINIMUM_MSG: DIT_NOT_MET_THE_MINIMUM_MSG;
        }
        if(feedBackMap.get("Minimum Correct Answers") != "n/a") {
             correctAnswersComparation = Integer.valueOf(feedBackMap.get("Correct Answers")) >= Integer.valueOf(feedBackMap.get("Minimum Correct Answers")) ? MET_THE_MINIMUM_MSG: DIT_NOT_MET_THE_MINIMUM_MSG;
        }

        feedBackMap.put("Correct Answers Evaluation",correctAnswersComparation);
        feedBackMap.put("Grade Evaluation",gradeComparation);

        return feedBackMap;
    }

    private Map<String,String> grade(Map<String, List<String>> toEvaluateSymbolTable, Map<String, Map<String, Integer>> rightAnswersSymbolTable) {
        int grade = 0;
        int numberOfCorrectAnswers = 0;
        Map<String,String> toReturn = new LinkedHashMap<>();
        String questionReport = "";
        for (String receivedQuestion : toEvaluateSymbolTable.keySet()) {
            if (rightAnswersSymbolTable.containsKey(receivedQuestion)) {
                for (String candidateAnswer : toEvaluateSymbolTable.get(receivedQuestion)) {
                    for (String respostaCorreta : rightAnswersSymbolTable.get(receivedQuestion).keySet()) {
                        if (candidateAnswer.contains(respostaCorreta)) {
                            numberOfCorrectAnswers++;
                            questionReport+=receivedQuestion+":" + "Correct\n";

                            grade += rightAnswersSymbolTable.get(receivedQuestion).get(respostaCorreta);
                            break;
                        }else{
                            questionReport+=receivedQuestion+":" + "Incorrect\n";
                        }
                    }
                }
            }
        }
        toReturn.put("Question report",questionReport.substring(0,questionReport.length()-1) );
        toReturn.put("Grade",String.valueOf(grade));
        toReturn.put("Correct Answers",String.valueOf(numberOfCorrectAnswers));
        return toReturn;
    }

}
