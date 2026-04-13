package strings.level3;

import java.util.Scanner;

public class FullPalindromeProgram {

    public static boolean checkIterative(String text) {

        // Pointer from start of string
        int start = 0;

        // Pointer from end of string
        int end = text.length() - 1;

        // Compare characters from both ends
        while (start < end) {

            // If mismatch found, not a palindrome
            if (text.charAt(start) != text.charAt(end))
                return false;

            // Move start pointer forward
            start++;

            // Move end pointer backward
            end--;
        }

        // If all characters matched, it's a palindrome
        return true;
    }

    // Method 2: Recursive approach
    public static boolean checkRecursive(String text, int start, int end) {

        // Base case: pointers crossed or met
        if (start >= end)
            return true;

        // If mismatch found
        if (text.charAt(start) != text.charAt(end))
            return false;

        // Recursive call moving inward
        return checkRecursive(text, start + 1, end - 1);
    }

    // Method 3: Using Reverse Array
    public static boolean checkUsingArray(String text) {

        // Convert string to character array
        char[] original = text.toCharArray();

        // Array to store reversed string
        char[] reverse = new char[original.length];

        // Build reversed array
        for (int i = 0; i < original.length; i++)
            reverse[i] = original[original.length - 1 - i];

        // Compare original and reversed arrays
        for (int i = 0; i < original.length; i++)
            if (original[i] != reverse[i])
                return false;

        // If all match, it's a palindrome
        return true;
    }

    public static void main(String[] args) {

        // Scanner for input
        Scanner input = new Scanner(System.in);

        // Read input string
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Iterative palindrome check
        System.out.println("Iterative Check: " + checkIterative(text));

        // Recursive palindrome check
        System.out.println("Recursive Check: " +
                checkRecursive(text, 0, text.length() - 1));

        // Array-based palindrome check
        System.out.println("Array Check: " + checkUsingArray(text));
    }
}