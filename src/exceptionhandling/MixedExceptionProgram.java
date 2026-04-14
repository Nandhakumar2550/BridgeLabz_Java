package exceptionhandling;

import java.io.*; // importing IO classes like IOException

// handling checked and unchecked
public class MixedExceptionProgram {

    static void process() throws IOException { // method declares it may throw a checked exception

        // checked exception
        if(true) { // condition always true (for demonstration)
            throw new IOException("File error"); // throwing checked exception
        }

        // unchecked exception
        // int x = 10 / 0; // example of ArithmeticException (unchecked)
    }

    public static void main(String[] args) {

        try {
            process(); // calling method that may throw exception

        } catch(IOException e) { // handling checked exception
            System.out.println("Checked Exception: " + e.getMessage()); // printing message

        } catch(Exception e) { // handling any other unchecked exceptions
            System.out.println("Unchecked Exception"); // generic message
        }
    }
}