import expressions.PluginsInterface;
import expressions.globalPluginsAnswersGrammar.ActionExprAnswersLexer;
import expressions.globalPluginsAnswersGrammar.EvalAnswersVisitor;
import expressions.globalPluginsAnswersGrammar.antlrAnswersGrammarParser;
import expressions.globalPluginsGrammar.EvalVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) throws IOException {





        String dirPath = "resources.plugins.InterviewModel.frontEndJuniorProgrammer";
        String dirName = "Plugin";
        String toEvaluateTxtPath = "src/resources/PluginsInput/interviews/frontEndJuniorProgrammer/interviewResult1.txt";

        try {
            // Load the class and instantiate it
            Class<?> clazz = Class.forName(dirPath + "." + dirName);
            PluginsInterface as = (PluginsInterface) clazz.getDeclaredConstructor().newInstance();

            // Call the evaluate method
            // TODO caminho relativo para dir path têm que ser verificado
            int res = as.evaluate(toEvaluateTxtPath,"src/"+dirPath);
            System.out.println(res);

        } catch (Exception e) {
            System.out.println("Error Preparing for evaluation:" + e.getMessage());
            e.printStackTrace();
        }


    }
}