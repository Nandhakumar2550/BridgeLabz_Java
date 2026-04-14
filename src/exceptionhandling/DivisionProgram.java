package exceptionhandling;

import java.util.*; // importing utility classes like Scanner and InputMismatchException

// division with exception handling
public class DivisionProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // creating Scanner object for user input

        try {
            // taking input
            int a = sc.nextInt(); // reading first integer
            int b = sc.nextInt(); // reading second integer

            // division
            System.out.println("Result: " + (a / b)); // performing division and printing result

        } catch(ArithmeticException e) { // catching division by zero exception
            System.out.println("Cannot divide by zero"); // error message for divide by zero

        } catch(InputMismatchException e) { // catching invalid input (non-integer)
            System.out.println("Invalid input"); // error message for wrong input type
        }
    }
}