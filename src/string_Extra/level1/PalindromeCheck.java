package string_Extra.level1;

public class PalindromeCheck {

    public static boolean isPalindrome(String text) {

        // Initialize starting pointer
        int start = 0;

        // Initialize ending pointer
        int end = text.length() - 1;

        // Loop until start crosses end
        while (start < end) {

            // Compare characters at start and end
            if (text.charAt(start) != text.charAt(end))

                // If mismatch found, it's not a palindrome
                return false;

            // Move start pointer forward
            start++;

            // Move end pointer backward
            end--;
        }

        // If all characters matched, it's a palindrome
        return true;
    }
}