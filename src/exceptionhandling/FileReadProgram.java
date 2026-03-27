package exceptionhandling;

import java.io.*;

// read file and handle exception
public class FileReadProgram {

    public static void main(String[] args) {

        try {
            // reading file
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));

            String line;

            // printing file content
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch(IOException e) {
            // file not found or error
            System.out.println("File not found");
        }
    }
}