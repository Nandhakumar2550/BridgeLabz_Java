package arrays.level1;
import java.util.*;

public class OddEvenArraySeparator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        int number;
        // Variable to store user input

        System.out.print("Enter a natural number: ");
        // Prompts user for input

        number = input.nextInt();
        // Reads number

        if (number <= 0) {
            // Checks if input is not a natural number

            System.out.println("Invalid input. Please enter a natural number.");
            return;
            // Stops execution if invalid
        }

        int[] oddNumbers = new int[number / 2 + 1];
        // Array to store odd numbers (approx size)

        int[] evenNumbers = new int[number / 2 + 1];
        // Array to store even numbers

        int oddIndex = 0;
        // Index tracker for odd array

        int evenIndex = 0;
        // Index tracker for even array

        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                // Checks if number is even

                evenNumbers[evenIndex] = i;
                // Stores even number

                evenIndex++;
                // Move to next position
            } else {
                // Otherwise it's odd

                oddNumbers[oddIndex] = i;
                // Stores odd number

                oddIndex++;
                // Move to next position
            }
        }

        System.out.println("Odd Numbers:");
        // Prints odd numbers label

        for (int i = 0; i < oddIndex; i++) {
            System.out.println(oddNumbers[i]);
            // Prints odd numbers
        }

        System.out.println("Even Numbers:");
        // Prints even numbers label

        for (int i = 0; i < evenIndex; i++) {
            System.out.println(evenNumbers[i]);
            // Prints even numbers
        }

        input.close();
        // Closes Scanner
    }
}