package string_Extra.level1;

import java.util.Scanner;

public class AnagramCheck {

    public static boolean isAnagram(String s1, String s2) {

        // Check if lengths are different → cannot be anagram
        if (s1.length() != s2.length())
            return false;

        // Create a frequency array for all ASCII characters
        int[] freq = new int[256];

        // Traverse both strings together
        for (int i = 0; i < s1.length(); i++) {

            // Increase count for character in first string
            freq[s1.charAt(i)]++;

            // Decrease count for character in second string
            freq[s2.charAt(i)]--;
        }

        // Check if all frequencies are zero
        for (int f : freq)

            // If any value is not zero → not an anagram
            if (f != 0)
                return false;

        // If all counts are zero → strings are anagrams
        return true;
    }

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Read first string
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        // Read second string
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Call isAnagram method and store result
        boolean result = isAnagram(s1, s2);

        // Display result
        if (result)
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are NOT Anagrams");

        // Close scanner
        sc.close();
    }
}