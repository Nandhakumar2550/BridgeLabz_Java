package searchingAndFileHanding;

import java.io.*;

public class InputStreamExample {

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("test.txt"), "UTF-8"))){

            String line;

            while((line = br.readLine()) != null)
                System.out.println(line);

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
