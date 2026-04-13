package arrays.level1;
import java.util.*;

public class DynamicFactorFinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        int number;
        // Variable to store input number

        System.out.print("Enter a number: ");
        // Prompts user

        number = input.nextInt();
        // Reads number

        int maxFactor = 10;
        // Initial capacity of array

        int[] factors = new int[maxFactor];
        // Array to store factors

        int index = 0;
        // Tracks number of factors

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                // Checks if i is a factor

                if (index == maxFactor) {
                    // If array is full → resize

                    maxFactor = maxFactor * 2;
                    // Doubles capacity

                    int[] temp = new int[maxFactor];
                    // Creates new larger array

                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                        // Copies old elements
                    }

                    factors = temp;
                    // Reassigns new array
                }

                factors[index] = i;
                // Stores factor

                index++;
                // Moves to next index
            }
        }

        System.out.println("Factors of " + number + " are:");
        // Prints heading

        for (int i = 0; i < index; i++) {
            System.out.println(factors[i]);
            // Displays factors
        }

        input.close();
        // Closes Scanner
    }
}