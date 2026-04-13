package programming_elements.level1;
import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        double number1;
        double number2;
        // Declares two variables to store input numbers

        System.out.print("Enter first number: ");
        // Prompts user to enter first number

        number1 = input.nextDouble();
        // Reads first number from user

        System.out.print("Enter second number: ");
        // Prompts user to enter second number

        number2 = input.nextDouble();
        // Reads second number from user

        double addition = number1 + number2;
        // Calculates addition

        double subtraction = number1 - number2;
        // Calculates subtraction

        double multiplication = number1 * number2;
        // Calculates multiplication

        double division = number1 / number2;
        // Calculates division

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", "
                + subtraction + ", "
                + multiplication + ", and "
                + division);
        // Prints all results in one line
    }
}