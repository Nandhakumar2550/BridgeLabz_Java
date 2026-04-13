package arrays.level2;
import java.util.*;

public class DigitFrequencyCounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        int number;
        // Stores user input

        System.out.print("Enter a number: ");
        // Prompts user

        number = input.nextInt();
        // Reads number

        int tempNumber = Math.abs(number);
        // Converts number to positive for safe processing

        int[] frequency = new int[10];
        // Array to store frequency of digits (0–9)

        while (tempNumber != 0) {

            int digit = tempNumber % 10;
            // Extracts last digit

            frequency[digit]++;
            // Increments count for that digit

            tempNumber = tempNumber / 10;
            // Removes last digit
        }

        System.out.println("Digit Frequency:");
        // Prints heading

        for (int i = 0; i < frequency.length; i++) {

            if (frequency[i] > 0) {
                // Prints only digits that appeared

                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        input.close();
        // Closes Scanner
    }
}