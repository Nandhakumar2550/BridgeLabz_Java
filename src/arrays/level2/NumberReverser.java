package arrays.level2;
import java.util.*;

public class NumberReverser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        int number;
        // Stores input number

        System.out.print("Enter a number: ");
        // Prompts user

        number = input.nextInt();
        // Reads number

        int tempNumber = number;
        // Copy of number for processing

        int digitCount = 0;
        // Counts number of digits

        // Count digits
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            // Removes last digit

            digitCount++;
            // Increments digit count
        }

        int[] digits = new int[digitCount];
        // Array to store digits

        tempNumber = number;
        // Reset temp number

        int index = 0;
        // Index for array

        // Store digits
        while (tempNumber != 0) {

            digits[index] = tempNumber % 10;
            // Extracts and stores last digit

            tempNumber = tempNumber / 10;
            // Removes last digit

            index++;
            // Move to next index
        }

        System.out.println("Reversed number:");
        // Output heading

        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
            // Prints digits in reverse order
        }

        input.close();
        // Closes Scanner
    }
}