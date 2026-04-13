package string_Extra.level1;

import java.util.Scanner;

public class CountVowelsConsonants {

    public static int[] count(String text) {

        // Initialize counters for vowels and consonants
        int vowels = 0, consonants = 0;

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {

            // Convert character to lowercase for uniform comparison
            char ch = Character.toLowerCase(text.charAt(i));

            // Check if character is an alphabet (ignore digits, symbols, spaces)
            if (ch >= 'a' && ch <= 'z') {

                // Check if character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++; // Increment vowel count
                else
                    consonants++; // Otherwise it's a consonant
            }
        }

        // Return result as array: index 0 = vowels, index 1 = consonants
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask user to enter text
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Call count method and store result
        int[] result = count(text);

        // Display number of vowels
        System.out.println("Vowels: " + result[0]);

        // Display number of consonants
        System.out.println("Consonants: " + result[1]);

        // Close scanner to prevent resource leak
        input.close();
    }
}