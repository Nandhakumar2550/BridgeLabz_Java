package inbuild.level2;
import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
        // Converts Celsius to Fahrenheit
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
        // Converts Fahrenheit to Celsius
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.print("Enter temperature: ");
        // Prompts user to enter temperature

        double temp = input.nextDouble();
        // Reads temperature value

        System.out.print("Convert to (C/F): ");
        // Prompts user to choose conversion type

        char choice = input.next().charAt(0);
        // Reads user choice as character

        if (choice == 'C' || choice == 'c')
            // If user chooses Celsius

            System.out.println("Celsius: " + fahrenheitToCelsius(temp));
            // Converts Fahrenheit to Celsius

        else
            // For all other inputs (assumes Fahrenheit)

            System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
        // Converts Celsius to Fahrenheit

        input.close();
        // Closes Scanner
    }
}