package expressions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvalVisitor extends antlrGrammarBaseVisitor<Map<String,List<String>>> {

    private String lastQuestion;
    private String type;

    @Override
    public Map<String,List<String>> visitStart(antlrGrammarParser.StartContext ctx) {
        Map<String,List<String>> res = new HashMap<>();
        res.putAll(visitListOfQQuestionsAns(ctx.listOfQQuestionsAns()));
        return res;
    }
    @Override
    public Map<String,List<String>> visitListOfQQuestionsAns(antlrGrammarParser.ListOfQQuestionsAnsContext ctx){
        Map<String,List<String>> res = new HashMap<>();
        for (antlrGrammarParser.QuestionAnswerContext qaq : ctx.questionAnswer()){
         res.putAll(visitQuestionAnswer(qaq));
        }
        return res;
    }
    @Override
    public Map<String,List<String>> visitQuestionAnswer(antlrGrammarParser.QuestionAnswerContext ctx){
        Map<String,List<String>> res = new HashMap<>();

        res.putAll(visitQuestion(ctx.question()));
        res.putAll(visitAnswer(ctx.answer()));

        return res;
    }

    @Override
    public Map<String,List<String>> visitQuestion(antlrGrammarParser.QuestionContext ctx){
        Map<String,List<String>> res = new HashMap<>();
        lastQuestion = ctx.getText().replace('\n','\0');
        type = ctx.TYPE().getText();
        return res;
    }
    public Map<String,List<String>> visitAnswer(antlrGrammarParser.AnswerContext ctx){
        String answer = ctx.getText();
        Map<String,List<String>> res = new HashMap<>();
        List<String> answersList = new ArrayList<>();

        if (type.compareTo("(Multiple Choice)") == 0){
            answersList = List.of(answer.split(","));
        }else{
            answersList.add(answer);
        }

        res.put(lastQuestion,answersList);

        return res;
    }
}
