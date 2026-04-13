package searchingAndFileHanding;

import java.io.*;

public class InputStreamExample {

    public static void main(String[] args) {

        // Try-with-resources to automatically close BufferedReader
        try(BufferedReader br = new BufferedReader(

                // InputStreamReader converts byte stream to character stream
                // FileInputStream reads raw bytes from file "test.txt"
                // "UTF-8" specifies character encoding
                new InputStreamReader(new FileInputStream("test.txt"), "UTF-8"))){

            // Variable to store each line read from file
            String line;

            // Read file line by line until end (null indicates EOF)
            while((line = br.readLine()) != null)

                // Print each line to console
                System.out.println(line);

        } catch(Exception e){

            // Print exception if any error occurs (file not found, encoding issue, etc.)
            System.out.println(e);
        }
    }
}