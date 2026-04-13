package strings.level1;

import java.util.Scanner;

public class StringIndexDemo {

    public static void generate(String text) {

        // This will throw StringIndexOutOfBoundsException
        // because valid indices are 0 to length-1
        System.out.println(text.charAt(text.length())); // Invalid index
    }

    public static void handle(String text) {

        try {

            // Invalid access: index = length (out of range)
            System.out.println(text.charAt(text.length()));

        }
        // Handles string index out of bounds exception safely
        catch (StringIndexOutOfBoundsException e) {

            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter text: ");
        String text = input.next();

        // Safe method call with exception handling
        handle(text);
    }
}