package control_flows.level1;
import java.util.*;

public class NaturalNumberSum {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number ");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        if(num > 0){
            // Checks if the number is positive (natural number)

            int sum = num * (num + 1) / 2;
            // Calculates sum using formula n(n+1)/2

            System.out.println("The sum of " + num + " natural numbers is " + sum);
            // Displays the result

        } else {
            System.out.println("The number " + num + " is not a natural number");
            // Displays message for invalid input
        }

        scan.close();
        // Closes Scanner
    }
}