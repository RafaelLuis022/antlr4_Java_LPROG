package expressions.globalPluginsGrammar;

import java.util.*;

public class EvalVisitor extends antlrGrammarBaseVisitor<Map<String,List<String>>> {

    private Map<String,List<String>> tokenList;
    private Integer min_grade;

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
        return retrieveQuestionAnswerData(ctx.ctx_question.getText().trim(),ctx.ctx_answer.getText(),ctx.ctx_type.getText());
    }

    @Override
    public Map<String, List<String>> visitQuestion_timehour(antlrGrammarParser.Question_timehourContext ctx) {
        return retrieveQuestionAnswerData(ctx.ctx_question.getText().trim(),ctx.ctx_answer.getText(),ctx.ctx_type.getText());
    }

    @Override
    public Map<String, List<String>> visitQuestion_date(antlrGrammarParser.Question_dateContext ctx) {
        return retrieveQuestionAnswerData(ctx.ctx_question.getText().trim(),ctx.ctx_answer.getText(),ctx.ctx_type.getText());
    }

    @Override
    public Map<String, List<String>> visitQuestion_numericalscale(antlrGrammarParser.Question_numericalscaleContext ctx) {
        return retrieveQuestionAnswerData(ctx.ctx_question.getText().trim(),ctx.ctx_answer.getText(),ctx.ctx_type.getText());
    }

    @Override
    public Map<String, List<String>> visitQuestion_decimal(antlrGrammarParser.Question_decimalContext ctx) {
        return retrieveQuestionAnswerData(ctx.ctx_question.getText().trim(),ctx.ctx_answer.getText(),ctx.ctx_type.getText());
    }

    @Override
    public Map<String, List<String>> visitQuestion_integer(antlrGrammarParser.Question_integerContext ctx) {
        return retrieveQuestionAnswerData(ctx.ctx_question.getText().trim(),ctx.ctx_answer.getText(),ctx.ctx_type.getText());
    }

    @Override
    public Map<String, List<String>> visitQuestion_shorttext(antlrGrammarParser.Question_shorttextContext ctx) {
        return retrieveQuestionAnswerData(ctx.ctx_question.getText().trim(),ctx.ctx_answer.getText(),ctx.ctx_type.getText());
    }

    @Override
    public Map<String, List<String>> visitQuestion_multiplechoice(antlrGrammarParser.Question_multiplechoiceContext ctx) {
        return retrieveQuestionAnswerData(ctx.ctx_question.getText().trim(),ctx.ctx_answer.getText(),ctx.ctx_type.getText());
    }

    @Override
    public Map<String, List<String>> visitQuestion_singlechoice(antlrGrammarParser.Question_singlechoiceContext ctx) {
        return retrieveQuestionAnswerData(ctx.ctx_question.getText().trim(),ctx.ctx_answer.getText(),ctx.ctx_type.getText());
    }

    private Map<String,List<String>> retrieveQuestionAnswerData(String question,String answer,String type) {

        List<String> answers = new ArrayList<>();

        if (type.equals("(Multiple Choice)")) {
            answers = List.of(answer.split(","));
        } else {
            answers.add(answer);
        }

        tokenList.put(question, answers);
        return tokenList;

    }
}
