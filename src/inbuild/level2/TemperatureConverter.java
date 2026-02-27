package inbuild.level2;
import java.util.Scanner;
public class TemperatureConverter {
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = input.nextDouble();

        System.out.print("Convert to (C/F): ");
        char choice = input.next().charAt(0);

        if (choice == 'C' || choice == 'c')
            System.out.println("Celsius: " + fahrenheitToCelsius(temp));
        else
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
    }
}
