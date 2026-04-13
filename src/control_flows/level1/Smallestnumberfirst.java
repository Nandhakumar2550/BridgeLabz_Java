package control_flows.level1;
import java.util.*;

public class Smallestnumberfirst {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number1 ");
        // Prompts user to enter first number

        int num1 = scan.nextInt();
        // Reads first number

        System.out.println("Enter the number2 ");
        // Prompts user to enter second number

        int num2 = scan.nextInt();
        // Reads second number

        System.out.println("Enter the number3");
        // Prompts user to enter third number

        int num3 = scan.nextInt();
        // Reads third number

        boolean issmallest = (num1 < num2 && num1 < num3);
        // Checks if first number is smaller than both others

        System.out.println(" Is the first number the smallest? " + issmallest);
        // Displays result (true/false)

        scan.close();
        // Closes Scanner
    }
}