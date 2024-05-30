package plugin;

import expressions.EvaluatePlugins;

import java.io.*;
import java.util.Map;


public class Plugin {

    private static final String BASE_ANSWERS_TXT_NAME = "BaseAnswers.txt";

    private String dirPath;
    private String toEvaluateTxtPath;
    public Plugin(String dirPath, String toEvaluateTxtPath) {
        this.dirPath = dirPath;
        this.toEvaluateTxtPath = toEvaluateTxtPath;
    }

    public Map<String,String> evaluate() {
        String pathToAllAnswersTxt = dirPath + "/" + BASE_ANSWERS_TXT_NAME;
        EvaluatePlugins evaluatePlugins = new EvaluatePlugins(toEvaluateTxtPath,pathToAllAnswersTxt);
        return evaluatePlugins.evaluate();
    }



    public boolean isCorrect() {
        String pathToAllAnswersTxt = dirPath + "/" + BASE_ANSWERS_TXT_NAME;
        EvaluatePlugins evaluatePlugins = new EvaluatePlugins(toEvaluateTxtPath,pathToAllAnswersTxt);
        return evaluatePlugins.isSyntaxCorrect();
    }

    public static  String generateBlankForm(String dirPath) {
        String baseAnswersPath = dirPath + "/" +  BASE_ANSWERS_TXT_NAME;
        String blankFormPath = dirPath + "/" + "BlankForm.txt";
        StringBuilder blankFormContent = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(baseAnswersPath))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().startsWith("#")) {
                    blankFormContent.append(line).append("\n");
                } else if (line.contains("->")) {

                        blankFormContent.append("\n");

                } else {
                    blankFormContent.append(line).append("\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading or writing file: " + e.getMessage());
            throw new RuntimeException(e);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(blankFormPath))) {
            bw.write(blankFormContent.toString());
        } catch (IOException e) {
            System.out.println("Error writing blank form file: " + e.getMessage());
            throw new RuntimeException(e);
        }

        return blankFormPath;
    }
}
