package searchingAndFileHanding;

import java.io.*;

public class InputToFile {

    public static void main(String[] args) {

        // Try-with-resources to automatically close BufferedReader and FileWriter
        try(

                // BufferedReader to read input from keyboard (System.in)
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                // FileWriter to write data into "output.txt"
                FileWriter fw = new FileWriter("output.txt")
        ){

            // Variable to store user input
            String input;

            // Infinite loop to continuously take input
            while(true){

                // Read a line from user
                input = br.readLine();

                // Check if user wants to exit (case-insensitive)
                if(input.equalsIgnoreCase("exit"))

                    // Break the loop if "exit" is entered
                    break;

                // Write input to file with newline
                fw.write(input + "\n");
            }

        } catch(Exception e){

            // Print exception if any error occurs
            System.out.println(e);
        }
    }
}