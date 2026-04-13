package strings.level2;

import java.util.Scanner;

public class StringLengthWithoutBuiltIn {

    public static int findLength(String text) {

        // Counter to store string length manually
        int count = 0;

        try {

            // Loop continuously until exception occurs
            while (true) {

                // Try accessing each character by index
                text.charAt(count);

                // Increment counter for each valid character
                count++;
            }

        }
        // Exception occurs when index goes out of bounds
        catch (StringIndexOutOfBoundsException e) {

            // Return final calculated length
            return count;
        }
    }

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter text: ");
        String text = input.next();

        // Manual length calculation
        int manualLength = findLength(text);

        // Built-in length calculation
        int builtInLength = text.length();

        // Print both results
        System.out.println("Manual Length: " + manualLength);
        System.out.println("Built-in Length: " + builtInLength);
    }
}