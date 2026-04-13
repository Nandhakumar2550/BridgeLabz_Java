package strings.level1;

import java.util.Scanner;

public class CharArrayCompare {

    public static char[] getChars(String text) {

        // Create a char array with same length as input string
        char[] arr = new char[text.length()];

        // Loop through each character of the string
        for (int i = 0; i < text.length(); i++)

            // Copy each character into array
            arr[i] = text.charAt(i);

        // Return manually created char array
        return arr;
    }

    public static boolean compareArrays(char[] a, char[] b) {

        // If lengths are different, arrays are not equal
        if (a.length != b.length)
            return false;

        // Compare each element of both arrays
        for (int i = 0; i < a.length; i++)

            // If any mismatch found, return false
            if (a[i] != b[i])
                return false;

        // If all elements match, arrays are equal
        return true;
    }

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter text
        System.out.print("Enter text: ");
        String text = input.next();

        // Convert string to char array manually
        char[] manual = getChars(text);

        // Convert string to char array using built-in method
        char[] builtIn = text.toCharArray();

        // Compare both arrays and display result
        System.out.println("Same? " + compareArrays(manual, builtIn));
    }
}