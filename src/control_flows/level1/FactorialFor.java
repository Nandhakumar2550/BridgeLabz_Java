package control_flows.level1;
import java.util.*;

public class FactorialFor {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the Number");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        if(num > 0){
            // Checks if number is positive

            int sum = 1;
            // Initializes factorial result to 1

            for(int i = 1; i <= num; i++){
                // Loop from 1 to the given number

                sum = sum * i;
                // Multiplies each number to calculate factorial
            }

            System.out.println("The factorial of " + num + " is " + sum);
            // Displays factorial result

        } else {
            System.out.println("Enter the positive number");
            // Handles invalid (non-positive) input
        }

        scan.close();
        // Closes Scanner
    }
}