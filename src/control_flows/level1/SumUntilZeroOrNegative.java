package control_flows.level1;
import java.util.*;

public class SumUntilZeroOrNegative {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        double num;
        // Declares variable to store input number

        double sum = 0;
        // Initializes sum variable

        while(true){
            // Infinite loop that runs until break condition

            System.out.println("Enter the number");
            // Prompts user to enter a number

            num = scan.nextDouble();
            // Reads the number

            if(num <= 0){
                // Checks if number is zero or negative

                break;
                // Exits the loop
            }

            sum = sum + num;
            // Adds positive number to sum
        }

        System.out.println(sum);
        // Displays total sum

        scan.close();
        // Closes Scanner
    }
}