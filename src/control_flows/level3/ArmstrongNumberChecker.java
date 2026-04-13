package control_flows.level3;
import java.sql.SQLOutput;
import java.util.*;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        int temp = num;
        // Stores original number for processing

        int sum = 0;
        // Initializes sum of cubes

        while(temp > 0){
            // Loop runs until all digits are processed

            int rem = temp % 10;
            // Extracts last digit

            sum = sum + (rem * rem * rem);
            // Adds cube of digit to sum

            temp = temp / 10;
            // Removes last digit
        }

        if(sum == num){
            // Checks if sum of cubes equals original number

            System.out.println("The Given Number is an Armstrong");
            // Armstrong number

        } else {
            System.out.println("The given number is not an Armstrong");
            // Not an Armstrong number
        }

        scan.close();
        // Closes Scanner
    }
}