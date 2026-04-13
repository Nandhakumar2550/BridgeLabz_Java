package strings.level1;

import java.util.Scanner;

public class LowerCaseConverter {

    public static String manualLower(String text) {

        // Initialize result string to store converted characters
        String result = "";

        // Loop through each character of the string
        for (int i = 0; i < text.length(); i++) {

            // Get current character
            char ch = text.charAt(i);

            // Check if character is uppercase (A-Z)
            if (ch >= 'A' && ch <= 'Z')

                // Convert uppercase to lowercase using ASCII shift (+32)
                result += (char)(ch + 32);

            else

                // If not uppercase, keep character as it is
                result += ch;
        }

        // Return fully converted lowercase string
        return result;
    }

    public static boolean compare(String s1, String s2) {

        // If lengths differ, strings are not equal
        if (s1.length() != s2.length())
            return false;

        // Compare each character one by one
        for (int i = 0; i < s1.length(); i++)

            // If any mismatch found, return false
            if (s1.charAt(i) != s2.charAt(i))
                return false;

        // If all characters match, strings are equal
        return true;
    }

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for input string
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Convert string using manual method
        String manual = manualLower(text);

        // Convert string using built-in method
        String builtIn = text.toLowerCase();

        // Print both results
        System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtIn);

        // Compare both results
        System.out.println("Same? " + compare(manual, builtIn));
    }
}