package control_flows.level1;
import java.util.*;

public class SumUntilZero {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the num ");
        // Prompts user to enter first number

        double num = scan.nextDouble();
        // Reads first number

        double sum = 0;
        // Initializes sum variable

        while(num != 0){
            // Loop continues until user enters 0

            sum = sum + num;
            // Adds current number to sum

            System.out.println("Enter the number");
            // Prompts user for next number

            num = scan.nextDouble();
            // Reads next number
        }

        System.out.println(sum);
        // Displays total sum

        scan.close();
        // Closes Scanner
    }
}