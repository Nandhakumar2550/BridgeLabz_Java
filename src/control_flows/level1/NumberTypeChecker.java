package control_flows.level1;
import java.util.*;

public class NumberTypeChecker {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number ");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        if (num > 0) {
            // Checks if number is positive

            System.out.println("The number is positive ");
            // Displays positive message

        } else if (num < 0) {
            // Checks if number is negative

            System.out.println("The number is negative ");
            // Displays negative message

        } else {
            // Executes when number is zero

            System.out.println("The number is Zero");
            // Displays zero message
        }

        scan.close();
        // Closes Scanner
    }
}