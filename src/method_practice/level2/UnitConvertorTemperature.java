package method_practice.level2;
import java.util.*;
public class UnitConvertorTemperature {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKg(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKgToPounds(double kg) {
        double kilograms2pounds = 2.20462;
        return kg * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the fahrenheit");
        double fahrenheit=scan.nextDouble();
        System.out.println("Enter the celsius");
        double celsius=scan.nextDouble();
        System.out.println("Enter the pounds");
        double pounds=scan.nextDouble();
        System.out.println("Enter the kg");
        double kg=scan.nextDouble();
        System.out.println("Enter the gallons");
        double gallons=scan.nextDouble();
        System.out.println("Enter the liters");
        double liters=scan.nextDouble();
        System.out.println("convertFahrenheitToCelsius " + convertFahrenheitToCelsius(fahrenheit));
        System.out.println("convertCelsiusToFahrenheit" + convertCelsiusToFahrenheit(celsius) );
        System.out.println("convertPoundsToKg " + convertPoundsToKg(pounds));
        System.out.println("convertKgToPounds " + convertKgToPounds(kg));
        System.out.println("convertGallonsToLiters" + convertGallonsToLiters(gallons));
        System.out.println("convertLitersToGallons"+ convertLitersToGallons(liters));
    }
}
