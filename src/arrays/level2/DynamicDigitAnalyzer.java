package arrays.level2;
import java.util.*;

public class DynamicDigitAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        int number;
        System.out.print("Enter a number: ");
        // Prompts user

        number = input.nextInt();
        // Reads input number

        int maxDigit = 10;
        // Initial array size

        int[] digits = new int[maxDigit];
        // Array to store digits

        int index = 0;
        // Tracks number of digits stored

        int tempNumber = number;
        // Copy of number for processing

        while (tempNumber != 0) {

            if (index == maxDigit) {
                // If array is full → resize

                maxDigit += 10;
                // Increase size

                int[] temp = new int[maxDigit];
                // New bigger array

                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                // Copy old data

                digits = temp;
                // Assign new array
            }

            digits[index] = tempNumber % 10;
            // Extract last digit

            tempNumber = tempNumber / 10;
            // Remove last digit

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