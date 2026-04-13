package control_flows.level1;
import java.util.*;

public class Largestnumber {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number1 ");
        // Prompts user to enter first number

        int num1 = scan.nextInt();
        // Reads first number

        System.out.println("Enter the number2");
        // Prompts user to enter second number

        int num2 = scan.nextInt();
        // Reads second number

        System.out.println("Enter the number3");
        // Prompts user to enter third number

        int num3 = scan.nextInt();
        // Reads third number

        boolean num1islargest = (num1 > num2 && num1 > num3);
        // Checks if first number is greater than both others

        boolean num2islargest = (num2 > num1 && num2 > num3);
        // Checks if second number is greater than both others

        boolean num3islargest = (num3 > num2 && num3 > num1);
        // Checks if third number is greater than both others

        System.out.println(" Is the first number the largest? " + num1islargest);
        // Displays result for first number

        System.out.println("Is the second number the largest? " + num2islargest);
        // Displays result for second number

        System.out.println("Is the third number the largest? " + num3islargest);
        // Displays result for third number
    }
}