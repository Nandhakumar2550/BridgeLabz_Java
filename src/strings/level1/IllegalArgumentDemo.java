package strings.level1;

import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generate(String text) {

        // This will throw IllegalArgumentException because start index > end index
        System.out.println(text.substring(5, 2)); // start > end
    }

    public static void handle(String text) {

        try {

            // This line throws IllegalArgumentException (invalid substring range)
            System.out.println(text.substring(5, 2));

        }
        // Handles invalid argument cases like incorrect substring indices
        catch (IllegalArgumentException e) {

            System.out.println("Handled IllegalArgumentException");
        }
        // Fallback handler for any other runtime exceptions
        catch (RuntimeException e) {

            System.out.println("Handled Generic RuntimeException");
        }
    }

    public static void main(String[] args) {

        // Scanner object for reading user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter text: ");
        String text = input.next();

        // This will crash program if uncommented
        // generate(text);

        // Safe execution with exception handling
        handle(text);
    }
}