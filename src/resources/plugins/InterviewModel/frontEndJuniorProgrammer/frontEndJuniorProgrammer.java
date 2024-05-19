package resources.plugins.InterviewModel.frontEndJuniorProgrammer;

import expressions.ActionExprLexer;
import expressions.EvalVisitor;
import expressions.antlrGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import resources.plugins.Evaluator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class frontEndJuniorProgrammer implements Evaluator {

    Map<String, Map<String,Integer>> tokenMap;
    String txtName;
    public frontEndJuniorProgrammer(){
        this.tokenMap = fillTokenList();
    }
    public ParseTree prepareParseTree(String dirName){

        ParseTree parseTree;

        try{
        String pathStr = dirName + "/" + txtName();
        ActionExprLexer lexer = new ActionExprLexer(CharStreams.fromFileName(pathStr));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        antlrGrammarParser parser = new antlrGrammarParser(tokens);
        parseTree =  parser.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return parseTree;

    }

    public Map<String, List<String>> parseWithVisitor(ParseTree parseTree){
        EvalVisitor evalVisitor = new EvalVisitor();

        Map<String, List<String>> result;

        result = evalVisitor.visit(parseTree);

        return result;
    }

    @Override
    public String txtName() {
        return "interviewFile.txt";
    }

    @Override
    public Integer evaluate(String dirPath) {
        try {
            // Prepare the parse tree
            ParseTree parseTree = prepareParseTree(dirPath);

            // Parse with visitor
            Map<String, List<String>> questionAnswerMap = parseWithVisitor(parseTree);

            // Return the assigned grade
            return grade(questionAnswerMap);
        } catch (Exception e) {
            // Provide detailed exception information
            System.out.println("ERROR during evaluation: " + e.getMessage());
            e.printStackTrace();
            return -1;
        }
    }

    public Map<String,Map<String,Integer>> fillTokenList(){
        Map<String,Map<String,Integer>> tokenMap = new HashMap<>();
        String question;
        Map<String,Integer> values;

        // Question 1
        question = "# Are you familiar with any front end frameworks?(Short Text)";
        values = new HashMap<>();
        values.put("react",35);
        tokenMap.put(question,values);

        // Question 2
        question = "# How do you optimize the performance of a websites front end?(Short Text)";
        values = new HashMap<>();
        values.put("memory management",35);
        tokenMap.put(question,values);

        // Question 3
        question = "# What are the different types of HTML elements you commonly use?(Short Text)";
        values = new HashMap<>();
        values.put("div",15);
        tokenMap.put(question,values);

        // Question 4
        question = "# Which programming languages do you prefer: Python,JavaScript,Java,C?(Multiple Choice)";
        values = new HashMap<>();
        values.put("Java",5);
        values.put("Python",5);
        values.put("JavaScript",5);
        tokenMap.put(question,values);



        return tokenMap;
    }

    public Integer grade(Map<String, List<String>> questionAnswerMap){

        int grade = 0;

        for (String key : questionAnswerMap.keySet()){
            String trimedString = key.trim(); // Removing leading and trailing spaces
            if (tokenMap.containsKey(trimedString)){

                if (questionAnswerMap.get(key).size() > 1){
                    for (String answers : questionAnswerMap.get(key)){
                        if (tokenMap.get(trimedString).get(answers) != null){
                            grade += tokenMap.get(trimedString).get(answers);
                        }
                    }
                }else{
                    grade += tokenMap.get(trimedString).get(questionAnswerMap.get(key).get(0));
                }

            }
        }

        return grade;
    }
}
