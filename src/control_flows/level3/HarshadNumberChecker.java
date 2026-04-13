package control_flows.level3;
import java.util.*;

public class HarshadNumberChecker {
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
        // Initializes sum of digits

        while(temp > 0){
            // Loop runs until all digits are processed

            int digit = temp % 10;
            // Extracts last digit

            sum = sum + digit;
            // Adds digit to sum

            temp = temp / 10;
            // Removes last digit
        }

        if(num % sum == 0){
            // Checks if number is divisible by sum of its digits

            System.out.println("Number is Harshad");
            // Harshad number

        } else {
            System.out.println("Number is Not Harshad");

        }

        scan.close();
        // Closes Scanner
    }
}