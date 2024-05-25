package resources.plugins.InterviewModel.frontEndJuniorProgrammer;

import expressions.EvaluatePlugins;
import expressions.PluginsInterface;

import javax.print.DocFlavor;
import java.nio.file.Path;

public class Plugin implements PluginsInterface {

    public Plugin(){}

    @Override
    public String txtName() {
        return "BaseModel.txt";
    }

    private String allAnswersTxtName(){
        return "BaseAnswers.txt";
    }




    @Override
    public Integer evaluate(String toEvaluateTxtPath,String toThisDirPath) {

        String pathToAllAnswersTxt = toThisDirPath.replace(".","/") + "/" + allAnswersTxtName();
        EvaluatePlugins evaluatePlugins = new EvaluatePlugins(toEvaluateTxtPath,pathToAllAnswersTxt);
        return evaluatePlugins.evaluate();
    }
}
