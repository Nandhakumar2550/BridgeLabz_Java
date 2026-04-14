package exceptionhandling;

import java.io.*; // importing file handling classes

// reading two files and writing to third
public class MultiFileProcessor {

    public static void main(String[] args) {

        // try with multiple resources
        try(
                BufferedReader br1 = new BufferedReader(new FileReader("file1.txt")); // reader for first file
                BufferedReader br2 = new BufferedReader(new FileReader("file2.txt")); // reader for second file
                BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt")) // writer for output file
        ) {

            String line; // variable to store each line

            // reading file1
            while((line = br1.readLine()) != null) { // reading first file line by line
                bw.write(line); // writing line to output file
                bw.newLine(); // adding new line after each line
            }

            // reading file2
            while((line = br2.readLine()) != null) { // reading second file line by line
                bw.write(line); // writing line to output file
                bw.newLine(); // adding new line
            }

        } catch(IOException e) {
            System.out.println("Error processing files"); // handling file-related exceptions
        }
    }
}