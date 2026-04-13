package strings.level2;

import java.util.Scanner;

public class ManualSplit {

    public static int findLength(String text) {

        // Counter to determine string length manually
        int count = 0;

        try {

            // Keep accessing characters until exception occurs
            while (true) {
                text.charAt(count); // Access character at index
                count++;            // Increment counter
            }

        } catch (Exception e) {

            // When exception occurs, return length found so far
            return count;
        }
    }

    public static String[] splitText(String text) {

        // Get length of string manually
        int length = findLength(text);

        // Count words assuming at least one word exists
        int wordCount = 1;

        // Count spaces to determine number of words
        for (int i = 0; i < length; i++)
            if (text.charAt(i) == ' ')
                wordCount++;

        // Create array to store words
        String[] words = new String[wordCount];

        // Start index of each word
        int start = 0, index = 0;

        // Loop through string including last boundary
        for (int i = 0; i <= length; i++) {

            // If space or end of string is found
            if (i == length || text.charAt(i) == ' ') {

                // Extract word using substring
                words[index++] = text.substring(start, i);

                // Move start to next character after space
                start = i + 1;
            }
        }

        // Return array of words
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {

        // If lengths differ, arrays are not equal
        if (a.length != b.length)
            return false;

        // Compare each word
        for (int i = 0; i < a.length; i++)

            // If any mismatch found, return false
            if (!a[i].equals(b[i]))
                return false;

        // If all words match, arrays are equal
        return true;
    }

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for sentence
        System.out.print("Enter sentence: ");
        String text = input.nextLine();

        // Manual split implementation
        String[] manual = splitText(text);

        // Built-in split method
        String[] builtIn = text.split(" ");

        // Compare both results
        System.out.println("Same? " + compareArrays(manual, builtIn));
    }
}