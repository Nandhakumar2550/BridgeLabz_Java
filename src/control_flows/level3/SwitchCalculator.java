package control_flows.level3;
import java.util.*;

public class SwitchCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number1");
        // Prompts user to enter first number

        int num1 = scan.nextInt();
        // Reads first number

        System.out.println("Enter the number2");
        // Prompts user to enter second number

        int num2 = scan.nextInt();
        // Reads second number

        System.out.println("Enter the operator");
        // Prompts user to enter operator (+, -, *, /)

        String op = scan.next();
        // Reads operator as string

        double result;
        // Declares variable to store result

        switch(op){
            case "+":
                result = num1 + num2;
                // Performs addition

                System.out.println("Result " + result);
                break;

            case "-":
                result = num1 - num2;
                // Performs subtraction

                System.out.println("Result " + result);
                break;

            case "*":
                result = num1 * num2;
                // Performs multiplication

                System.out.println("Result " + result);
                break;

            case "/":
                result = num1 / num2;
                // Performs division (integer division issue here)

                System.out.println("Result " + result);
                break;

            default:
                System.out.println("Invalid input");
                // Handles invalid operator
        }

        scan.close();
        // Closes Scanner
    }
}