package strings.level3;

import java.util.Scanner;

public class AnagramChecker {

    public static boolean isAnagram(String s1, String s2) {

        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length())
            return false;

        // Frequency array for ASCII characters
        int[] freq = new int[256];

        // Traverse both strings simultaneously
        for (int i = 0; i < s1.length(); i++) {

            // Increase count for character in first string
            freq[s1.charAt(i)]++;

            // Decrease count for character in second string
            freq[s2.charAt(i)]--;
        }

        // Check if all frequencies are balanced (zero)
        for (int i = 0; i < 256; i++)

            // If any value is not zero, not an anagram
            if (freq[i] != 0)
                return false;

        // All counts matched → valid anagram
        return true;
    }

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Input first string
        System.out.print("Enter first text: ");
        String text1 = input.nextLine();

        // Input second string
        System.out.print("Enter second text: ");
        String text2 = input.nextLine();

        // Check anagram condition and print result
        if (isAnagram(text1, text2))
            System.out.println("The texts are Anagrams.");
        else
            System.out.println("The texts are NOT Anagrams.");
    }
}