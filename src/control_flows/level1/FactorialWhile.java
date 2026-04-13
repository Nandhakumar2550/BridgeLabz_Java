package control_flows.level1;
import java.util.*;

public class FactorialWhile {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        if(num > 0){
            // Checks if number is positive

            int count = 1;
            // Initializes counter for loop

            int sum = 1;
            // Initializes factorial result to 1

            while(count <= num){
                // Loop runs until count reaches the number

                sum = sum * count;
                // Multiplies current count to result

                count++;
                // Increments counter
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