import expressions.PluginsInterface;

public class Main {
    public static void main(String[] args) {
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