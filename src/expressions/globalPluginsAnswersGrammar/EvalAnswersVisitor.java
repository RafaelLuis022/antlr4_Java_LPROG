package expressions.globalPluginsAnswersGrammar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvalAnswersVisitor extends antlrAnswersGrammarBaseVisitor<Map<String,Map<String,Integer>>> {

    private Map<String,Map<String,Integer>> tokenList;
    private String lastQuestion;

    @Override
    public Map<String,Map<String,Integer>> visitStart(antlrAnswersGrammarParser.StartContext ctx) {
        tokenList = new HashMap<>();
        visit(ctx.listOfQuestions());
        return tokenList;
    }
    public Map<String,Map<String,Integer>>  visitListOfQuestions(antlrAnswersGrammarParser.ListOfQuestionsContext ctx){
        for (antlrAnswersGrammarParser.QuestionsContext questionsContext : ctx.questions()){
             visit(questionsContext);
        }
        return tokenList;
    }

    public Map<String,Map<String,Integer>> visitQuestions(antlrAnswersGrammarParser.QuestionsContext ctx){
        lastQuestion = ctx.ctx_question.getText();
        for (antlrAnswersGrammarParser.AnswersContext as : ctx.answers()){
            visit(as);
        }
        return tokenList;

    }
    public Map<String,Map<String,Integer>> visitAnswers(antlrAnswersGrammarParser.AnswersContext ctx){
        Map<String,Integer> valueMap = new HashMap<>();

        String answer = ctx.ctx_answer.getText();
        int value = Integer.parseInt(ctx.ctx_value.getText());

        valueMap.put(answer,value);

        Map<String,Integer> mapToFill;
        if ( (mapToFill = tokenList.putIfAbsent(lastQuestion, valueMap)) != null){
            mapToFill.put(answer,value);
            tokenList.put(lastQuestion,mapToFill);
        };

        return tokenList;
    }
}
