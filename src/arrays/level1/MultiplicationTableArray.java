package arrays.level1;
import java.util.*;

public class MultiplicationTableArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object for user input

        int number;
        // Variable to store the number entered by user

        int[] table = new int[10];
        // Array to store multiplication results (1 to 10)

        System.out.print("Enter a number: ");
        // Prompts user to enter number

        number = input.nextInt();
        // Reads input number

        for (int i = 1; i <= 10; i++) {

            table[i - 1] = number * i;
            // Stores multiplication result in array (index starts from 0)
        }

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " * " + i + " = " + table[i - 1]);
            // Prints multiplication table using stored values
        }

        input.close();
        // Closes Scanner
    }
}