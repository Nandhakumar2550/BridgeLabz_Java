package classandobject.level2;

public class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is NOT a Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();
        p.text = "Madam";
        p.displayResult();
    }
}
