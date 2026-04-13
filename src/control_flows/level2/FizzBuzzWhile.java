package control_flows.level2;
import java.util.*;

public class FizzBuzzWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        if(num > 0){
            // Checks if the number is positive

            int count = 1;
            // Initializes counter for while loop

            while(count <= num){
                // Loop runs from 1 to the given number

                if(count % 3 == 0 && count % 5 == 0){
                    // Checks if number is divisible by both 3 and 5

                    System.out.println("FizzBuzz");
                    // Prints FizzBuzz

                } else if(count % 3 == 0){
                    // Checks if number is divisible by 3

                    System.out.println("Fizz");
                    // Prints Fizz

                } else if(count % 5 == 0){
                    // Checks if number is divisible by 5

                    System.out.println("Buzz");
                    // Prints Buzz

                } else {
                    // Executes when none of the conditions match

                    System.out.println(count);
                    // Prints the number itself
                }

                count++;
                // Increments counter
            }

        } else {
            System.out.println("Enter the positive value");
            // Handles invalid input
        }

        scan.close();
        // Closes Scanner
    }
}