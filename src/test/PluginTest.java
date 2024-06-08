package test;

import org.junit.jupiter.api.Test;
import plugin.Plugin;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class PluginTest {

    @Test
    public void ensureFullyCorrectFileAnswersGetsMaxGradeAndPasses(){
        Plugin plugin = new Plugin("src/test/TestPluginsFolder", "src/test/TestPluginsFolder/FullCorrectAnswers.txt");

        Map<String,String> finalResult = plugin.evaluate();

        assertEquals(finalResult.get("Grade"), "50");
        assertEquals(finalResult.get("Correct Answers"), "6");
        assertEquals(finalResult.get("Grade Evaluation"), "Met the minimum");
    }

    @Test
    public void ensureFullyWrongFileAnswersGets0GradeAndDoesNotPass(){
        Plugin plugin = new Plugin("src/test/TestPluginsFolder", "src/test/TestPluginsFolder/zeroGradeAnswers.txt");

        Map<String,String> finalResult = plugin.evaluate();

        assertEquals(finalResult.get("Grade"), "0");
        assertEquals(finalResult.get("Correct Answers"), "0");
        assertEquals(finalResult.get("Grade Evaluation"), "Did not meet the minimum");
    }

    @Test
    public void ensureHalfCorrectFileAnswersGetsHalfGradeAndPasses(){
        Plugin plugin = new Plugin("src/test/TestPluginsFolder", "src/test/TestPluginsFolder/HalfCorrectAnswers.txt");

        Map<String,String> finalResult = plugin.evaluate();

        assertEquals(finalResult.get("Grade"), "30");
        assertEquals(finalResult.get("Correct Answers"), "3");
        assertEquals(finalResult.get("Grade Evaluation"), "Met the minimum"); //should pass because he gets 30 and minimum is 20
    }

    @Test
    public void ensureFileAnsweredWithWrongSyntaxGetsReturnFalseOnIfSyntaxCorrect(){
        Plugin plugin = new Plugin("src/test/TestPluginsFolder", "src/test/TestPluginsFolder/wrongSyntax.txt");

        Boolean finalResult = plugin.isCorrect();

        assertFalse(finalResult);
    }

    @Test
    public void ensureFileAnsweredWithRightSyntaxGetsReturnTrueOnIfSyntaxCorrect(){
        Plugin plugin = new Plugin("src/test/TestPluginsFolder", "src/test/TestPluginsFolder/zeroGradeAnswers.txt");

        Boolean finalResult = plugin.isCorrect();

        assertTrue(finalResult);
    }

    @Test
    public void ensureCantHaveLessQuestionsThanRequiredToPass(){
        Plugin plugin = new Plugin("src/test/TestPluginsFolder2", "src/test/TestPluginsFolder/FullCorrectAnswers.txt");

        Boolean finalResult = plugin.isCorrect();

        assertFalse(finalResult);
    }

    @Test
    public void ensureTotalPointsToPassIsNotBiggerThanTotalObtainableInQuestions(){
        Plugin plugin = new Plugin("src/test/TestPluginsFolder3", "src/test/TestPluginsFolder/FullCorrectAnswers.txt");

        Boolean finalResult = plugin.isCorrect();

        assertFalse(finalResult);
    }


}
