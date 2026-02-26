package strings.level3;
import java.util.Scanner;
public class FullPalindromeProgram {
    public static boolean checkIterative(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }

        return true;
    }

    // Method 2: Recursive
    public static boolean checkRecursive(String text, int start, int end) {

        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return checkRecursive(text, start + 1, end - 1);
    }

    // Method 3: Using Reverse Array
    public static boolean checkUsingArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];

        for (int i = 0; i < original.length; i++)
            reverse[i] = original[original.length - 1 - i];

        for (int i = 0; i < original.length; i++)
            if (original[i] != reverse[i])
                return false;

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        System.out.println("Iterative Check: " + checkIterative(text));
        System.out.println("Recursive Check: " +
                checkRecursive(text, 0, text.length() - 1));
        System.out.println("Array Check: " + checkUsingArray(text));
    }
}
