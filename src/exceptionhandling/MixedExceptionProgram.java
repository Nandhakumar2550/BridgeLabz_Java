package exceptionhandling;

import java.io.*;

// handling checked and unchecked
public class MixedExceptionProgram {

    static void process() throws IOException {

        // checked exception
        if(true) {
            throw new IOException("File error");
        }

        // unchecked exception
        // int x = 10 / 0;
    }

    public static void main(String[] args) {

        try {
            process();

        } catch(IOException e) {
            System.out.println("Checked Exception: " + e.getMessage());

        } catch(Exception e) {
            System.out.println("Unchecked Exception");
        }
    }
}