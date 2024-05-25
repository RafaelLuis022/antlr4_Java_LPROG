package expressions.globalPluginsGrammar;

import java.util.*;

public class EvalVisitor extends antlrGrammarBaseVisitor<Map<String,List<String>>> {

    private Map<String,List<String>> tokenList;

    @Override
    public Map<String,List<String>> visitStart(antlrGrammarParser.StartContext ctx) {
        tokenList = new HashMap<>();
        tokenList.putAll(visitListOfQuestions(ctx.listOfQuestions()));
        return tokenList;
    }
    public Map<String,List<String>>  visitListOfQuestions(antlrGrammarParser.ListOfQuestionsContext ctx){
        Map<String,List<String>> res = new HashMap<>();
        for (antlrGrammarParser.QuestionsContext questionsContext : ctx.questions()){
            res.putAll(visit(questionsContext));
        }

        return res;
    }
    @Override
    public Map<String, List<String>> visitQuestion_tf(antlrGrammarParser.Question_tfContext ctx) {

        String question = ctx.ctx_question.getText().trim();

        List<String> ls = new ArrayList<>();

        ls.add(ctx.ctx_answer.getText());

        tokenList.put(question,ls);

        return tokenList;
    }

    @Override
    public Map<String, List<String>> visitQuestion_timehour(antlrGrammarParser.Question_timehourContext ctx) {

        String question = ctx.ctx_question.getText().trim();

        List<String> ls = new ArrayList<>();

        ls.add(ctx.ctx_answer.getText());

        tokenList.put(question,ls);

        return tokenList;
    }

    @Override
    public Map<String, List<String>> visitQuestion_date(antlrGrammarParser.Question_dateContext ctx) {

        String question = ctx.ctx_question.getText().trim();

        List<String> ls = new ArrayList<>();

        ls.add(ctx.ctx_answer.getText());

        tokenList.put(question,ls);


        return tokenList;
    }

    @Override
    public Map<String, List<String>> visitQuestion_numericalscale(antlrGrammarParser.Question_numericalscaleContext ctx) {

        String question = ctx.ctx_question.getText().trim();

        List<String> ls = new ArrayList<>();

        ls.add(ctx.ctx_answer.getText());

        tokenList.put(question,ls);


        return tokenList;
    }

    @Override
    public Map<String, List<String>> visitQuestion_decimal(antlrGrammarParser.Question_decimalContext ctx) {

        String question = ctx.ctx_question.getText().trim();

        List<String> ls = new ArrayList<>();

        ls.add(ctx.ctx_answer.getText());

        tokenList.put(question,ls);


        return tokenList;
    }

    @Override
    public Map<String, List<String>> visitQuestion_integer(antlrGrammarParser.Question_integerContext ctx) {

        String question = ctx.ctx_question.getText().trim();

        List<String> ls = new ArrayList<>();

        ls.add(ctx.ctx_answer.getText());

        tokenList.put(question,ls);

        return tokenList;
    }

    @Override
    public Map<String, List<String>> visitQuestion_shorttext(antlrGrammarParser.Question_shorttextContext ctx) {

        String question = ctx.ctx_question.getText().trim();

        List<String> ls = new ArrayList<>();

        ls.add(ctx.ctx_answer.getText());

        tokenList.put(question,ls);

        return tokenList;
    }

    @Override
    public Map<String, List<String>> visitQuestion_multiplechoice(antlrGrammarParser.Question_multiplechoiceContext ctx) {

        String question = ctx.ctx_question.getText().trim();

        List<String> ls;

        ls = List.of(ctx.ctx_answer.getText().split(","));



        tokenList.put(question,ls);

        return tokenList;
    }

    @Override
    public Map<String, List<String>> visitQuestion_singlechoice(antlrGrammarParser.Question_singlechoiceContext ctx) {

        String question = ctx.ctx_question.getText().trim();

        List<String> ls = new ArrayList<>();

        ls.add(ctx.ctx_answer.getText());

        tokenList.put(question,ls);

        return tokenList;
    }
}
