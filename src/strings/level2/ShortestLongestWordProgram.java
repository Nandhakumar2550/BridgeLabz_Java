package strings.level2;

import java.util.Scanner;

public class ShortestLongestWordProgram {

    public static int findLength(String text) {

        // Counter to calculate string length manually
        int count = 0;

        try {

            // Keep accessing characters until exception occurs
            while (true) {
                text.charAt(count); // Access character at index
                count++;            // Increment counter
            }

        } catch (Exception e) {

            // Return final length when exception occurs
            return count;
        }
    }

    // Manual split using charAt()
    public static String[] splitText(String text) {

        // Get length of string manually
        int length = findLength(text);

        // Count words (at least one word assumed)
        int wordCount = 1;

        // Count spaces to determine number of words
        for (int i = 0; i < length; i++)
            if (text.charAt(i) == ' ')
                wordCount++;

        // Create array to store words
        String[] words = new String[wordCount];

        // Start index for word extraction
        int start = 0, index = 0;

        // Loop through string including end boundary
        for (int i = 0; i <= length; i++) {

            // If space or end of string is found
            if (i == length || text.charAt(i) == ' ') {

                // Temporary variable to build word
                String word = "";

                // Build word character by character
                for (int j = start; j < i; j++)
                    word += text.charAt(j);

                // Store word in array
                words[index++] = word;

                // Move start pointer to next word
                start = i + 1;
            }
        }

        // Return array of words
        return words;
    }

    // Create 2D array with word and its length
    public static String[][] createWordLengthArray(String[] words) {

        // Create 2D array: [word][length]
        String[][] result = new String[words.length][2];

        // Fill array with word and its length
        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i]; // store word

            result[i][1] = String.valueOf(findLength(words[i])); // store length as string
        }

        return result;
    }

    // Find shortest and longest word
    public static String[] findShortestLongest(String[][] data) {

        // Initialize min and max length
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Store shortest and longest words
        String shortest = "";
        String longest = "";

        // Traverse all words
        for (int i = 0; i < data.length; i++) {

            // Convert length from String to int
            int length = Integer.parseInt(data[i][1]);

            // Check for shortest word
            if (length < min) {
                min = length;
                shortest = data[i][0];
            }

            // Check for longest word
            if (length > max) {
                max = length;
                longest = data[i][0];
            }
        }

        // Return shortest and longest words
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Read full sentence
        System.out.print("Enter sentence: ");
        String text = input.nextLine();

        // Split sentence into words
        String[] words = splitText(text);

        // Create word-length mapping
        String[][] wordData = createWordLengthArray(words);

        // Find shortest and longest words
        String[] result = findShortestLongest(wordData);

        // Print table header
        System.out.println("\nWord\tLength");

        // Print each word with its length
        for (int i = 0; i < wordData.length; i++)
            System.out.println(wordData[i][0] + "\t" + wordData[i][1]);

        // Print results
        System.out.println("\nShortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
    }
}