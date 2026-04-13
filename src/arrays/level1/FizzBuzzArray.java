package arrays.level1;
import java.util.*;

public class FizzBuzzArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        int number;
        // Variable to store user input

        System.out.print("Enter a positive integer: ");
        // Prompts user

        number = input.nextInt();
        // Reads input

        if (number <= 0) {
            System.out.println("Invalid input.");
            return;
            // Exits if input is not positive
        }

        String[] results = new String[number];
        // Array to store FizzBuzz results

        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                results[i - 1] = "FizzBuzz";
                // Stores "FizzBuzz" for multiples of 3 and 5
            }
            else if (i % 3 == 0) {
                results[i - 1] = "Fizz";
                // Stores "Fizz" for multiples of 3
            }
            else if (i % 5 == 0) {
                results[i - 1] = "Buzz";
                // Stores "Buzz" for multiples of 5
            }
            else {
                results[i - 1] = String.valueOf(i);
                // Stores number as string
            }
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
            // Displays each result with position
        }

        input.close();
        // Closes Scanner
    }
}