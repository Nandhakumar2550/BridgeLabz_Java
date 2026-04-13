package programming_elements.level2;
import java.util.*;

public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        double fahrenheit;
        // Declares variable to store temperature in Fahrenheit

        System.out.print("Enter temperature in Fahrenheit: ");
        // Prompts user to enter temperature

        fahrenheit = input.nextDouble();
        // Reads temperature value from user

        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        // Converts Fahrenheit to Celsius using formula (F - 32) × 5/9

        System.out.println("The " + fahrenheit +
                " fahrenheit is " + celsiusResult +
                " celsius");
        // Displays the converted temperature
    }
}