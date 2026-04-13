package arrays.level1;
import java.util.*;

public class MultiplicationSixToNine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object for input

        int number;
        // Variable to store user input number

        int[] multiplicationResult = new int[4];
        // Array to store results of multiplication (6 to 9 → 4 values)

        System.out.print("Enter a number: ");
        // Prompts user to enter number

        number = input.nextInt();
        // Reads number from user

        int index = 0;
        // Index to store values in array

        for (int i = 6; i <= 9; i++) {

            multiplicationResult[index] = number * i;
            // Stores multiplication result in array

            index++;
            // Moves to next index
        }

        index = 0;
        // Reset index for printing

        for (int i = 6; i <= 9; i++) {

            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            // Prints multiplication result

            index++;
            // Moves to next index
        }

        input.close();
        // Closes Scanner
    }
}