package strings.level3;

import java.util.Scanner;

public class UniqueCharacters {

    public static char[] findUnique(String text) {

        // Temporary array to store unique characters
        char[] temp = new char[text.length()];

        // Index for storing unique characters
        int index = 0;

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {

            // Assume current character is unique
            boolean isUnique = true;

            // Check previous characters for duplicates
            for (int j = 0; j < i; j++)

                // If duplicate found, mark as not unique
                if (text.charAt(i) == text.charAt(j))
                    isUnique = false;

            // If character is unique, store it
            if (isUnique)
                temp[index++] = text.charAt(i);
        }

        // Create final array with exact size of unique characters
        char[] result = new char[index];

        // Copy unique characters to result array
        for (int i = 0; i < index; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Input string
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Find unique characters
        char[] unique = findUnique(text);

        // Print result
        System.out.println("Unique Characters:");
        for (char c : unique)
            System.out.print(c + " ");
    }
}