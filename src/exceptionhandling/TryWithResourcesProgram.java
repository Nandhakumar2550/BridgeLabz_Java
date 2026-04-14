package exceptionhandling;

import java.io.*; // importing file handling classes like BufferedReader, FileReader, IOException

// auto closing file
public class TryWithResourcesProgram {

    public static void main(String[] args) {

        // try with resources
        try(BufferedReader br = new BufferedReader(new FileReader("info.txt"))) { // opening file with auto-close feature

            // reading first line
            System.out.println(br.readLine()); // reading and printing the first line of the file

        } catch(IOException e) {
            System.out.println("Error reading file"); // handling file-related exceptions
        }
    }
}