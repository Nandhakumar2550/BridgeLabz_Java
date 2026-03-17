package searchingAndFileHanding;

import java.io.*;

public class WordCount {

    public static void main(String[] args) {

        String target = "java";
        int count = 0;

        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){

            String line;

            while((line = br.readLine()) != null){

                String words[] = line.split(" ");

                for(String word : words){
                    if(word.equalsIgnoreCase(target))
                        count++;
                }
            }

            System.out.println("Count: " + count);

        } catch(Exception e){
            System.out.println(e);
        }
    }
}