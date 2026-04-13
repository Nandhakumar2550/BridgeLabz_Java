package strings.level1;

import java.util.Scanner;

public class UpperCaseConverter {

    public static String manualUpper(String text) {

        // Initialize result string to store converted uppercase text
        String result = "";

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {

            // Get current character
            char ch = text.charAt(i);

            // Check if character is lowercase (a-z)
            if (ch >= 'a' && ch <= 'z')

                // Convert lowercase to uppercase using ASCII (-32)
                result += (char)(ch - 32);

            else

                // Keep non-lowercase characters unchanged
                result += ch;
        }

        // Return fully converted uppercase string
        return result;
    }

    public static boolean compare(String s1, String s2) {

        // If lengths differ, strings are not equal
        if (s1.length() != s2.length())
            return false;

        // Compare each character one by one
        for (int i = 0; i < s1.length(); i++)

            // If mismatch found, return false
            if (s1.charAt(i) != s2.charAt(i))
                return false;

        // If all characters match, strings are equal
        return true;
    }

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Convert using manual method
        String manual = manualUpper(text);

        // Convert using built-in method
        String builtIn = text.toUpperCase();

        // Print both results
        System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtIn);

        // Compare both results
        System.out.println("Same? " + compare(manual, builtIn));
    }
}