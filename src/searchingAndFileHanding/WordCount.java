package searchingAndFileHanding;

import java.io.*;

public class WordCount {

    public static void main(String[] args) {

        // Target word to count in file
        String target = "java";

        // Variable to store count of occurrences
        int count = 0;

        // Try-with-resources to automatically close BufferedReader
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){

            // Variable to store each line read from file
            String line;

            // Read file line by line
            while((line = br.readLine()) != null){

                // Split line into words using space as delimiter
                String words[] = line.split(" ");

                // Traverse each word in the line
                for(String word : words){

                    // Check if word matches target (case-insensitive)
                    if(word.equalsIgnoreCase(target))

                        // Increment count if match is found
                        count++;
                }
            }

            // Print total count of target word
            System.out.println("Count: " + count);

        } catch(Exception e){

            // Print exception if any error occurs
            System.out.println(e);
        }
    }
}