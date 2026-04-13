package control_flows.level1;
import java.util.*;

public class NaturalNumberSumFor {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        if(num > 0){
            // Checks if the number is a natural number

            int sum = 0;
            // Initializes sum for loop calculation

            for(int i = 1; i <= num; i++){
                // Loops from 1 to given number

                sum = sum + i;
                // Adds each number to sum
            }

            int sumvalue = num * (num + 1) / 2;
            // Calculates sum using formula n(n+1)/2

            System.out.println("Sum using while loop is " + sum);
            // Displays sum calculated using loop

            System.out.println("Sum using formula is " + sumvalue);
            // Displays sum calculated using formula

            System.out.println("Both computations are equal? " + (sumvalue == sum));
            // Checks and displays whether both results are equal

        } else {
            System.out.println("The number " + num + " is not a natural number");
            // Handles invalid input
        }

        scan.close();
        // Closes Scanner
    }
}