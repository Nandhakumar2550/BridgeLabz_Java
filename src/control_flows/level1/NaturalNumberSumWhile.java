package control_flows.level1;
import java.util.*;

public class NaturalNumberSumWhile {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        if(num > 0){
            // Checks if the number is a natural number

            int count = 1;
            // Initializes counter for while loop

            int sum = 0;
            // Initializes sum variable

            while(count <= num){
                // Loop runs until count reaches the number

                sum += count;
                // Adds current count to sum

                count++;
                // Increments counter
            }

            int sumvalue = num * (num + 1) / 2;
            // Calculates sum using formula n(n+1)/2

            System.out.println("Sum using while loop is " + sum);
            // Displays sum calculated using while loop

            System.out.println("Sum using formula is " + sumvalue);
            // Displays sum calculated using formula

            System.out.println("Both computations are equal? " + (sumvalue == sum));
            // Checks if both results are equal

        } else {
            System.out.println("The number " + num + " is not a natural number");
            // Handles invalid input
        }
    }
}