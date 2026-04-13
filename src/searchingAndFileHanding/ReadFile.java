package searchingAndFileHanding;

import java.io.*;

public class ReadFile {

    public static void main(String[] args) throws Exception {

        // Create FileWriter object to write into "test.txt"
        FileWriter fw = new FileWriter("test.txt");

        // Create BufferedReader to read from "test.txt"
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));

        // Variable to store each line read from file
        String line;

        // Read file line by line until end of file (null indicates EOF)
        while((line = br.readLine()) != null){

            // Print each line to console
            System.out.println(line);
        }
    }
}