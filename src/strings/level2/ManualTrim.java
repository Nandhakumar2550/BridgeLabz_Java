package strings.level2;

import java.util.Scanner;

public class ManualTrim {

    public static int[] findTrimIndexes(String text) {

        // Start pointer from beginning of string
        int start = 0;

        // End pointer from last character of string
        int end = text.length() - 1;

        // Move start forward while spaces are found
        while (start <= end && text.charAt(start) == ' ')
            start++;

        // Move end backward while spaces are found
        while (end >= start && text.charAt(end) == ' ')
            end--;

        // Return final valid start and end indexes
        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end) {

        // Initialize result string
        String result = "";

        // Extract characters from start to end (inclusive)
        for (int i = start; i <= end; i++)

            // Append each character to result
            result += text.charAt(i);

        // Return manually created trimmed string
        return result;
    }

    public static boolean compare(String s1, String s2) {

        // If lengths differ, strings are not equal
        if (s1.length() != s2.length())
            return false;

        // Compare character by character
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

        // Input string with spaces
        System.out.print("Enter text with spaces: ");
        String text = input.nextLine();

        // Get start and end indexes after trimming spaces manually
        int[] indexes = findTrimIndexes(text);

        // Create manually trimmed string
        String manual = createSubstring(text, indexes[0], indexes[1]);

        // Built-in trim method
        String builtIn = text.trim();

        // Print results
        System.out.println("Manual Trim: " + manual);
        System.out.println("Built-in Trim: " + builtIn);

        // Compare both results
        System.out.println("Same? " + compare(manual, builtIn));
    }
}