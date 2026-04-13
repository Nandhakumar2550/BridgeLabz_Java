package strings.level3;

public class PalindromeCheck {

    public static boolean checkIterative(String text) {

        // Start pointer from beginning of string
        int start = 0;

        // End pointer from last character of string
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

        // If all characters matched, it is a palindrome
        return true;
    }

    public static boolean checkRecursive(String text, int start, int end) {

        // Base condition: pointers have met or crossed
        if (start >= end)
            return true;

        // If mismatch found, not a palindrome
        if (text.charAt(start) != text.charAt(end))
            return false;

        // Recursive call moving inward
        return checkRecursive(text, start + 1, end - 1);
    }

    public static boolean checkUsingArray(String text) {

        // Convert string to character array
        char[] original = text.toCharArray();

        // Create array to store reversed string
        char[] reverse = new char[original.length];

        // Fill reverse array in reverse order
        for (int i = 0; i < original.length; i++)
            reverse[i] = original[original.length - 1 - i];

        // Compare original and reversed arrays
        for (int i = 0; i < original.length; i++)
            if (original[i] != reverse[i])
                return false;

        // If all match, it's a palindrome
        return true;
    }
}