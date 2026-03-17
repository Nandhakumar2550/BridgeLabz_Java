package searchingAndFileHanding;

import java.io.*;

public class ReadFile {

    public static void main(String[] args) throws Exception {
        FileWriter fw=new FileWriter("test.txt");
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));

            String line;

            while((line = br.readLine()) != null){
                System.out.println(line);
            }
    }
}
