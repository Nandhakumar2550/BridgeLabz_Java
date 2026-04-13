package control_flows.level2;
import java.util.*;

public class FizzBuzzFor {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the Number");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        if(num > 0){
            // Checks if the number is positive

            for(int i = 1; i <= num; i++){
                // Loops from 1 to the given number

                if(i % 3 == 0 && i % 5 == 0){
                    // Checks if number is divisible by both 3 and 5

                    System.out.println("FizzBuzz");
                    // Prints FizzBuzz

                } else if(i % 3 == 0){
                    // Checks if number is divisible by 3

                    System.out.println("Fizz");
                    // Prints Fizz

                } else if(i % 5 == 0){
                    // Checks if number is divisible by 5

                    System.out.println("Buzz");
                    // Prints Buzz

                } else {
                    // Executes if none of the above conditions are met

                    System.out.println(i);
                    // Prints the number itself
                }
            }

        } else {
            System.out.println("Enter the positive number");
            // Handles invalid input
        }

        scan.close();
        // Closes Scanner
    }
}