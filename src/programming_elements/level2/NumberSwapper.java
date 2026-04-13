package programming_elements.level2;
import java.util.*;

public class NumberSwapper {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        int number1;
        int number2;
        // Declares two variables to store numbers

        System.out.print("Enter first number: ");
        // Prompts user to enter first number

        number1 = input.nextInt();
        // Reads first number

        System.out.print("Enter second number: ");
        // Prompts user to enter second number

        number2 = input.nextInt();
        // Reads second number

        int temp = number1;
        // Stores value of number1 in temporary variable

        number1 = number2;
        // Assigns value of number2 to number1

        number2 = temp;
        // Assigns stored value (original number1) to number2

        System.out.println("The swapped numbers are "
                + number1 + " and " + number2);
        // Displays swapped values
    }
}