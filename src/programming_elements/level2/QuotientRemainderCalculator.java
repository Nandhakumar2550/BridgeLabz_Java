package programming_elements.level2;
import java.util.*;

public class QuotientRemainderCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        int number1;
        int number2;
        // Declares two integer variables

        System.out.print("Enter first number: ");
        // Prompts user to enter first number

        number1 = input.nextInt();
        // Reads first number

        System.out.print("Enter second number: ");
        // Prompts user to enter second number

        number2 = input.nextInt();
        // Reads second number

        int quotient = number1 / number2;
        // Calculates quotient (division result)

        int remainder = number1 % number2;
        // Calculates remainder using modulus operator

        System.out.println("The Quotient is " + quotient +
                " and Remainder is " + remainder +
                " of two numbers " + number1 +
                " and " + number2);
        // Displays quotient and remainder
    }
}