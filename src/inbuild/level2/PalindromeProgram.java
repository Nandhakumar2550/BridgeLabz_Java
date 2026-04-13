package inbuild.level2;
import java.util.Scanner;

public class PalindromeProgram {

    public static boolean isPalindrome(String text) {

        int start = 0;
        // Starting index

        int end = text.length() - 1;
        // Ending index

        while (start < end) {
            // Loop until both pointers meet

            if (text.charAt(start) != text.charAt(end))
                // Compares characters from start and end

                return false;
            // If mismatch, not a palindrome

            start++;
            // Move start forward

            end--;
            // Move end backward
        }

        return true;
        // If all characters match, it is a palindrome
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take input

        System.out.print("Enter text: ");
        // Prompts user to enter text

        String text = input.nextLine();
        // Reads input string

        if (isPalindrome(text))
            // Checks if string is palindrome

            System.out.println("Palindrome");
            // Prints palindrome result

        else
            System.out.println("Not Palindrome");
        // Prints not palindrome result

        input.close();
        // Closes Scanner
    }
}