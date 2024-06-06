import plugin.Plugin;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {



        String dirPath = "src/resources/input";
        String toEvaluateTxtPath = "src/resources/input/BlankForm.txt";



        Plugin plugin = new Plugin(dirPath, toEvaluateTxtPath);
        System.out.println(plugin.isCorrect());

        for (String p: plugin.evaluate().keySet()){
          // System.out.println(p + ":" + plugin.evaluate().get(p));
        }




    }
}