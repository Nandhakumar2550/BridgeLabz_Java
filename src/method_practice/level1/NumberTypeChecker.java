package method_practice.level1;
import java.util.*;

public class NumberTypeChecker {

    public static int checker(int num){

        if(num > 0){
            // Checks if number is positive

            return 1;
            // Returns 1 for positive

        } else if(num < 0){
            // Checks if number is negative

            return -1;
            // Returns -1 for negative

        } else {
            // If number is zero

            return 0;
            // Returns 0 for zero
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        int result = checker(num);
        // Calls method to determine number type

        System.out.println(result);
        // Displays result (1, -1, or 0)

        scan.close();
        // Closes Scanner
    }
}