package strings.level1;

import java.util.Scanner;

public class NumberFormatDemo {

    public static void generate(String text) {

        // Convert string to integer (may throw NumberFormatException)
        int number = Integer.parseInt(text);

        // Print converted number
        System.out.println(number);
    }

    public static void handle(String text) {

        try {

            // Attempt to convert string to integer
            int number = Integer.parseInt(text);

            // Print number if conversion is successful
            System.out.println(number);

        }
        // Handles invalid numeric format (e.g., "abc")
        catch (NumberFormatException e) {

            System.out.println("Handled NumberFormatException");
        }
        // Generic handler for any other runtime exceptions
        catch (RuntimeException e) {

            System.out.println("Handled Generic RuntimeException");
        }
    }

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter number as string
        System.out.print("Enter number in text form: ");
        String text = input.next();

        // This will crash program if uncommented
        // generate(text);

        // Safe execution with exception handling
        handle(text);
    }
}