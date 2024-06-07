import expressions.BasePlugin;
import plugin.Plugin;

import java.io.IOException;
import java.util.Map;

public class Main {


    public static void main(String[] args) throws IOException {



        String dirPath = "src/resources/input";
        String toEvaluateTxtPath = "src/resources/input/BlankForm.txt";


        Plugin plugin = new Plugin(dirPath, toEvaluateTxtPath);
        for ( Map.Entry<String,String> kv : plugin.evaluate().entrySet()){
            System.out.println(kv.getKey()+":"+kv.getValue());

        }






    }
}