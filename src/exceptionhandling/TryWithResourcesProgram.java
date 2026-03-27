package exceptionhandling;

import java.io.*;

// auto closing file
public class TryWithResourcesProgram {

    public static void main(String[] args) {

        // try with resources
        try(BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {

            // reading first line
            System.out.println(br.readLine());

        } catch(IOException e) {
            System.out.println("Error reading file");
        }
    }
}
