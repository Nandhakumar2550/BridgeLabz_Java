package control_flows.level1;
import java.util.*;

public class VotingEligibilityChecker {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the age ");
        // Prompts user to enter age

        int age = scan.nextInt();
        // Reads age value

        if(age >= 18){
            // Checks if age is 18 or above

            System.out.println("The person's age is " + age + " and can vote");
            // Displays eligible message

        } else {
            // Executes if age is below 18

            System.out.println("The person's age is " + age + " and cannot vote");
            // Displays not eligible message
        }

        scan.close();
        // Closes Scanner
    }
}