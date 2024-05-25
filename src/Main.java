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



        String dirPath = "src.resources.plugins.InterviewModel.frontEndJuniorProgrammer";
        String toEvaluateTxtPath = "src/resources/PluginsInput/interviews/frontEndJuniorProgrammer/interviewResult1.txt";


        Plugin plugin = new Plugin(dirPath, toEvaluateTxtPath);
        System.out.println(plugin.generateBlankForm());


    }
}