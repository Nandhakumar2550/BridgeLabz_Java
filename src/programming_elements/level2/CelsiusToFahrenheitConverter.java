package programming_elements.level2;
import java.util.*;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        double celsius;
        // Declares variable to store temperature in Celsius

        System.out.print("Enter temperature in Celsius: ");
        // Prompts user to enter temperature

        celsius = input.nextDouble();
        // Reads temperature value from user

        double fahrenheitResult = (celsius * 9 / 5) + 32;
        // Converts Celsius to Fahrenheit using formula (C × 9/5) + 32

        System.out.println("The " + celsius +
                " celsius is " + fahrenheitResult +
                " fahrenheit");
        // Displays the converted temperature
    }
}