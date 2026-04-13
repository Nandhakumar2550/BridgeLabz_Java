package classandobject.level2;

public class PalindromeChecker {

    // String to store input text
    String text;

    boolean isPalindrome() {

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(text).reverse().toString();

        // Compare original and reversed strings (case-insensitive)
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {

        // Check if the text is palindrome
        if (isPalindrome())

            // Print if palindrome
            System.out.println(text + " is a Palindrome");
        else

            // Print if not palindrome
            System.out.println(text + " is NOT a Palindrome");
    }

    public static void main(String[] args) {

        // Create object of PalindromeChecker
        PalindromeChecker p = new PalindromeChecker();

        // Assign value to text
        p.text = "Madam";

        // Display result
        p.displayResult();
    }
}