import resources.plugins.Evaluator;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        String dirPath = "resources.plugins.InterviewModel.frontEndJuniorProgrammer";
        String dirName = dirPath.substring(dirPath.lastIndexOf('.') + 1);

        try {
            // Load the class and instantiate it
            Class<?> clazz = Class.forName(dirPath + "." + dirName);
            Evaluator as = (Evaluator) clazz.getDeclaredConstructor().newInstance();

            // Call the evaluate method
            int res = as.evaluate("src/"+dirPath.replace(".", "/"));
            System.out.println(res);

        } catch (Exception e) {
            System.out.println("Error Preparing for evaluation" + e.getMessage());
            e.printStackTrace();
        }
    }
}