package strings.level1;

import java.util.Scanner;

public class StringCompare {

    public static boolean compareUsingCharAt(String s1, String s2) {

        // If lengths are different, strings cannot be equal
        if (s1.length() != s2.length())
            return false;

        // Compare each character one by one
        for (int i = 0; i < s1.length(); i++) {

            // If any character mismatch is found, return false
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        // If all characters match, strings are equal
        return true;
    }

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input first string
        System.out.print("Enter first string: ");
        String str1 = input.next();

        // Input second string
        System.out.print("Enter second string: ");
        String str2 = input.next();

        // Compare using manual method
        boolean manualResult = compareUsingCharAt(str1, str2);

        // Compare using built-in method
        boolean builtInResult = str1.equals(str2);

        // Print both results
        System.out.println("Manual Compare: " + manualResult);
        System.out.println("Built-in equals(): " + builtInResult);

        // Check if both methods give same result
        System.out.println("Results Same? " + (manualResult == builtInResult));
    }
}