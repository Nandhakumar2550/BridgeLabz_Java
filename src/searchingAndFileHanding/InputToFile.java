package searchingAndFileHanding;

import java.io.*;

public class InputToFile {

    public static void main(String[] args) {

        try(
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                FileWriter fw = new FileWriter("output.txt")
        ){

            String input;

            while(true){

                input = br.readLine();

                if(input.equalsIgnoreCase("exit"))
                    break;

                fw.write(input + "\n");
            }

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
