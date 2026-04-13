package method_practice.level2;
import java.util.*;

public class UnitConvertorTemperature {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
        // Converts Fahrenheit to Celsius
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
        // Converts Celsius to Fahrenheit
    }

    public static double convertPoundsToKg(double pounds) {

        double pounds2kilograms = 0.453592;
        // Conversion factor: pounds → kilograms

        return pounds * pounds2kilograms;
        // Converts pounds to kg
    }

    public static double convertKgToPounds(double kg) {

        double kilograms2pounds = 2.20462;
        // Conversion factor: kg → pounds

        return kg * kilograms2pounds;
        // Converts kg to pounds
    }

    public static double convertGallonsToLiters(double gallons) {

        double gallons2liters = 3.78541;
        // Conversion factor: gallons → liters

        return gallons * gallons2liters;
        // Converts gallons to liters
    }

    public static double convertLitersToGallons(double liters) {

        double liters2gallons = 0.264172;
        // Conversion factor: liters → gallons

        return liters * liters2gallons;
        // Converts liters to gallons
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object

        System.out.println("Enter the fahrenheit");
        // Prompts for Fahrenheit

        double fahrenheit = scan.nextDouble();
        // Reads Fahrenheit

        System.out.println("Enter the celsius");
        // Prompts for Celsius

        double celsius = scan.nextDouble();
        // Reads Celsius

        System.out.println("Enter the pounds");
        // Prompts for pounds

        double pounds = scan.nextDouble();
        // Reads pounds

        System.out.println("Enter the kg");
        // Prompts for kg

        double kg = scan.nextDouble();
        // Reads kg

        System.out.println("Enter the gallons");
        // Prompts for gallons

        double gallons = scan.nextDouble();
        // Reads gallons

        System.out.println("Enter the liters");
        // Prompts for liters

        double liters = scan.nextDouble();
        // Reads liters

        System.out.println("convertFahrenheitToCelsius " + convertFahrenheitToCelsius(fahrenheit));
        // Displays F → C

        System.out.println("convertCelsiusToFahrenheit" + convertCelsiusToFahrenheit(celsius));
        // Displays C → F

        System.out.println("convertPoundsToKg " + convertPoundsToKg(pounds));
        // Displays pounds → kg

        System.out.println("convertKgToPounds " + convertKgToPounds(kg));
        // Displays kg → pounds

        System.out.println("convertGallonsToLiters" + convertGallonsToLiters(gallons));
        // Displays gallons → liters

        System.out.println("convertLitersToGallons" + convertLitersToGallons(liters));
        // Displays liters → gallons

        scan.close();
        // Closes Scanner
    }
}