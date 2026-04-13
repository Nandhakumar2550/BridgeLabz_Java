package inbuild.level2;
import java.util.Scanner;

public class BasicCalculator {

    public static double add(double a, double b) { return a + b; }
    // Returns sum of two numbers

    public static double subtract(double a, double b) { return a - b; }
    // Returns difference of two numbers

    public static double multiply(double a, double b) { return a * b; }
    // Returns product of two numbers

    public static double divide(double a, double b) { return a / b; }
    // Returns division result

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.print("Enter first number: ");
        // Prompts user for first number

        double num1 = input.nextDouble();
        // Reads first number

        System.out.print("Enter second number: ");
        // Prompts user for second number

        double num2 = input.nextDouble();
        // Reads second number

        System.out.print("Choose operation (+ - * /): ");
        // Prompts user to choose operation

        char op = input.next().charAt(0);
        // Reads operator as a character

        switch (op) {
            case '+':
                System.out.println(add(num1, num2));
                // Calls addition method
                break;

            case '-':
                System.out.println(subtract(num1, num2));
                // Calls subtraction method
                break;

            case '*':
                System.out.println(multiply(num1, num2));
                // Calls multiplication method
                break;

            case '/':
                System.out.println(divide(num1, num2));
                // Calls division method
                break;

            default:
                System.out.println("Invalid operation");
                // Handles invalid operator
        }

        input.close();
        // Closes Scanner
    }
}