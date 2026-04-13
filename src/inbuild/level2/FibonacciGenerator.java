package inbuild.level2;
import java.util.Scanner;

public class FibonacciGenerator {

    public static void generate(int terms) {

        int a = 0, b = 1;
        // Initializes first two Fibonacci numbers

        for (int i = 1; i <= terms; i++) {
            // Loops for given number of terms

            System.out.print(a + " ");
            // Prints current Fibonacci number

            int next = a + b;
            // Calculates next number in sequence

            a = b;
            // Updates a to next value

            b = next;
            // Updates b to next value
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.print("Enter number of terms: ");
        // Prompts user to enter number of terms

        int terms = input.nextInt();
        // Reads number of terms

        generate(terms);
        // Calls method to generate Fibonacci sequence

        input.close();
        // Closes Scanner
    }
}