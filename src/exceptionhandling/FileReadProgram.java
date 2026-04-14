package exceptionhandling;

import java.io.*; // importing file handling classes like BufferedReader, FileReader, IOException

// read file and handle exception
public class FileReadProgram {

    public static void main(String[] args) {

        try {
            // reading file
            BufferedReader br = new BufferedReader(new FileReader("data.txt")); // opening file for reading

            String line; // variable to store each line of the file

            // printing file content
            while((line = br.readLine()) != null) { // reading file line by line
                System.out.println(line); // printing each line
            }

            br.close(); // closing the BufferedReader to release resources

        } catch(IOException e) {
            // file not found or error
            System.out.println("File not found"); // handling file-related exceptions
        }
    }
}