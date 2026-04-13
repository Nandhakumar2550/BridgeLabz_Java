package arrays.level2;
import java.util.*;

public class DigitAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        int number;
        System.out.print("Enter a number: ");
        // Prompts user

        number = input.nextInt();
        // Reads number

        int maxDigit = 10;
        // Maximum digits (for safety)

        int[] digits = new int[maxDigit];
        // Array to store digits

        int index = 0;
        // Tracks number of digits stored

        int tempNumber = number;
        // Copy of number for processing

        while (tempNumber != 0) {

            if (index == maxDigit) {
                // Prevents array overflow

                break;
            }

            digits[index] = tempNumber % 10;
            // Extracts last digit

            tempNumber = tempNumber / 10;
            // Removes last digit

            index++;
            // Move to next index
        }

        int largest = 0;
        // Stores largest digit

        int secondLargest = 0;
        // Stores second largest digit

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                // Update largest and second largest

                secondLargest = largest;
                largest = digits[i];

            } else if (digits[i] > secondLargest && digits[i] != largest) {
                // Update second largest

                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        // Prints largest digit

        System.out.println("Second largest digit: " + secondLargest);
        // Prints second largest digit

        input.close();
        // Closes Scanner
    }
}