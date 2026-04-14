package exceptionhandling;

import java.util.*; // importing utility classes like Scanner

// finally execution
public class FinallyBlockProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // creating Scanner object for user input

        try {
            int a = sc.nextInt(); // reading first integer
            int b = sc.nextInt(); // reading second integer

            System.out.println(a / b); // performing division and printing result

        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero"); // handling divide-by-zero exception

        } finally {
            // always executes
            System.out.println("Operation completed"); // this block runs whether exception occurs or not
        }
    }
}