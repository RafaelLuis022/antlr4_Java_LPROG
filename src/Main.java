import plugin.Plugin;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {



        String dirPath = "";
        String toEvaluateTxtPath = "";


        Plugin plugin = new Plugin(dirPath, toEvaluateTxtPath);
        for (String p: plugin.evaluate().keySet()){
            System.out.println(p + ":" + plugin.evaluate().get(p));
        }




    }
}