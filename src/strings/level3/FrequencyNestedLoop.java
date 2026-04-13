package strings.level3;

import java.util.Scanner;

public class FrequencyNestedLoop {

    public static String[] getFrequency(String text) {

        // Convert string into character array
        char[] chars = text.toCharArray();

        // Frequency array to store counts for each character position
        int[] freq = new int[chars.length];

        // Outer loop: pick each character one by one
        for (int i = 0; i < chars.length; i++) {

            // Skip already processed characters marked as '0'
            if (chars[i] == '0')
                continue;

            // Initialize frequency count for current character
            freq[i] = 1;

            // Inner loop: compare with remaining characters
            for (int j = i + 1; j < chars.length; j++) {

                // If duplicate found
                if (chars[i] == chars[j]) {

                    // Increase frequency count
                    freq[i]++;

                    // Mark duplicate as processed
                    chars[j] = '0';
                }
            }
        }

        // Count number of unique characters
        int count = 0;

        for (int i = 0; i < chars.length; i++)
            if (chars[i] != '0')
                count++;

        // Result array to store character-frequency pairs
        String[] result = new String[count];

        // Index for result array
        int index = 0;

        // Store character and its frequency
        for (int i = 0; i < chars.length; i++)
            if (chars[i] != '0')
                result[index++] = chars[i] + " = " + freq[i];

        return result;
    }

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Read input string
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Get frequency result
        String[] result = getFrequency(text);

        // Print output header
        System.out.println("\nCharacter Frequency:");

        // Print each character frequency
        for (String s : result)
            System.out.println(s);
    }
}