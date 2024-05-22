package expressions.globalPluginsAnswersGrammar;

import expressions.globalPluginsGrammar.antlrGrammarParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvalAnswersVisitor extends antlrAnswersGrammarBaseVisitor<Map<String, Map<String, Integer>>> {

    private Map<String, Map<String, Integer>> tokenList;


    @Override
    public Map<String, Map<String, Integer>> visitStart(antlrAnswersGrammarParser.StartContext ctx) {
        tokenList = new HashMap<>();
        tokenList.putAll(visitListOfQuestions(ctx.listOfQuestions()));
        return tokenList;
    }

    @Override
    public Map<String, Map<String, Integer>> visitListOfQuestions(antlrAnswersGrammarParser.ListOfQuestionsContext ctx) {
        Map<String, Map<String, Integer>> res = new HashMap<>();
        for (antlrAnswersGrammarParser.QuestionsContext questionsContext : ctx.questions()){
            res.putAll(visit(questionsContext));
        }

        return res;
    }

    @Override
    public Map<String, Map<String, Integer>> visitQuestions(antlrAnswersGrammarParser.QuestionsContext ctx) {
        visitChildren(ctx);
        return tokenList;
    }

    @Override
    public Map<String, Map<String, Integer>> visitQuestion_tf(antlrAnswersGrammarParser.Question_tfContext ctx) {
        return visitQuestionWithAnswer(ctx.ctx_question.getText(), ctx.ctx_answer.getText(), ctx.ctx_value.getText(),ctx.ctx_type.getText());
    }

    @Override
    public Map<String, Map<String, Integer>> visitQuestion_timehour(antlrAnswersGrammarParser.Question_timehourContext ctx) {
        return visitQuestionWithAnswer(ctx.ctx_question.getText(), ctx.ctx_answer.getText(), ctx.ctx_value.getText(),ctx.ctx_type.getText());
    }

    @Override
    public Map<String, Map<String, Integer>> visitQuestion_date(antlrAnswersGrammarParser.Question_dateContext ctx) {
        return visitQuestionWithAnswer(ctx.ctx_question.getText(), ctx.ctx_answer.getText(), ctx.ctx_value.getText(),ctx.ctx_type.getText());
    }

    @Override
    public Map<String, Map<String, Integer>> visitQuestion_numericalscale(antlrAnswersGrammarParser.Question_numericalscaleContext ctx) {
        return visitQuestionWithAnswer(ctx.ctx_question.getText(), ctx.ctx_answer.getText(), ctx.ctx_value.getText(),ctx.ctx_type.getText());
    }

    @Override
    public Map<String, Map<String, Integer>> visitQuestion_decimal(antlrAnswersGrammarParser.Question_decimalContext ctx) {
        return visitQuestionWithAnswer(ctx.ctx_question.getText(), ctx.ctx_answer.getText(), ctx.ctx_value.getText(),ctx.ctx_type.getText());
    }

    @Override
    public Map<String, Map<String, Integer>> visitQuestion_integer(antlrAnswersGrammarParser.Question_integerContext ctx) {
        return visitQuestionWithAnswer(ctx.ctx_question.getText(), ctx.ctx_answer.getText(), ctx.ctx_value.getText(),ctx.ctx_type.getText());
    }

    @Override
    public Map<String, Map<String, Integer>> visitQuestion_shorttext(antlrAnswersGrammarParser.Question_shorttextContext ctx) {
        return visitQuestionWithAnswer(ctx.ctx_question.getText(), ctx.ctx_answer.getText(), ctx.ctx_value.getText(),ctx.ctx_type.getText());
    }

    @Override
    public Map<String, Map<String, Integer>> visitQuestion_multiplechoice(antlrAnswersGrammarParser.Question_multiplechoiceContext ctx) {
        return visitQuestionWithAnswer(ctx.ctx_question.getText(), ctx.ctx_answer.getText(), ctx.ctx_value.getText(),ctx.ctx_type.getText());
    }

    @Override
    public Map<String, Map<String, Integer>> visitQuestion_singlechoice(antlrAnswersGrammarParser.Question_singlechoiceContext ctx) {
        return visitQuestionWithAnswer(ctx.ctx_question.getText(), ctx.ctx_answer.getText(), ctx.ctx_value.getText(),ctx.ctx_type.getText());
    }

    private Map<String, Map<String, Integer>> visitQuestionWithAnswer(String question, String answer, String valueText, String type) {
        Map<String, Integer> valueMap = tokenList.getOrDefault(question, new HashMap<>());

        int value = Integer.parseInt(valueText);

        if (type.equals("(Multiple Choice)")) {
            String[] answers = answer.split(",");
            int quotient = value / answers.length;
            int remainder = value % answers.length;

            for (int i = 0; i < answers.length; i++) {
                String ans = answers[i].trim();
                int distributedValue = quotient + (i < remainder ? 1 : 0);
                valueMap.put(ans, distributedValue);
            }
        } else {
            valueMap.put(answer, value);
        }

        tokenList.put(question, valueMap);
        return tokenList;
    }

}