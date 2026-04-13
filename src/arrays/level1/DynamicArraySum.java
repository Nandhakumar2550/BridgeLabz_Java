package arrays.level1;
import java.util.*;

public class DynamicArraySum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object for input

        double[] numbers = new double[10];
        // Array to store up to 10 numbers

        double total = 0.0;
        // Stores sum of numbers

        int index = 0;
        // Tracks number of elements entered

        while (true) {

            System.out.print("Enter a number (0 or negative to stop): ");
            // Prompts user

            double value = input.nextDouble();
            // Reads input value

            if (value <= 0 || index == numbers.length) {
                break;
                // Stops if value ≤ 0 OR array is full
            }

            numbers[index] = value;
            // Stores value in array

            index++;
            // Moves to next index
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
            // Adds only entered values
        }

        System.out.println("Numbers entered:");
        // Prints heading

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            // Displays entered numbers
        }

        System.out.println("Total sum is " + total);
        // Displays total sum

        input.close();
        // Closes Scanner
    }
}