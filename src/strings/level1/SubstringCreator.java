package strings.level1;

import java.util.Scanner;

public class SubstringCreator {

    public static String createSubstring(String text, int start, int end) {

        // Initialize result string to build substring manually
        String result = "";

        // Loop from start index to end index (end excluded)
        for (int i = start; i < end; i++)

            // Append each character to result
            result += text.charAt(i);

        // Return manually created substring
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {

        // If lengths differ, strings are not equal
        if (s1.length() != s2.length())
            return false;

        // Compare character by character
        for (int i = 0; i < s1.length(); i++)

            // If any mismatch found, return false
            if (s1.charAt(i) != s2.charAt(i))
                return false;

        // If all characters match, strings are equal
        return true;
    }

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter text: ");
        String text = input.next();

        // Input start index
        System.out.print("Enter start index: ");
        int start = input.nextInt();

        // Input end index
        System.out.print("Enter end index: ");
        int end = input.nextInt();

        // Create substring manually
        String manual = createSubstring(text, start, end);

        // Create substring using built-in method
        String builtIn = text.substring(start, end);

        // Print both results
        System.out.println("Manual Substring: " + manual);
        System.out.println("Built-in Substring: " + builtIn);

        // Compare both substrings
        System.out.println("Same? " + compareStrings(manual, builtIn));
    }
}