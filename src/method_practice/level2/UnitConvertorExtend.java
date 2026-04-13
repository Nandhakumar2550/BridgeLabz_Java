package method_practice.level2;
import java.util.*;

public class UnitConvertorExtend {

    public static double convertYardsToFeet(double yards) {

        double yards2feet = 3;
        // Conversion factor: 1 yard = 3 feet

        return yards * yards2feet;
        // Converts yards to feet
    }

    public static double convertFeetToYards(double feet) {

        double feet2yards = 0.333333;
        // Conversion factor: 1 foot ≈ 0.333333 yards

        return feet * feet2yards;
        // Converts feet to yards
    }

    public static double convertMetersToInches(double meters) {

        double meters2inches = 39.3701;
        // Conversion factor: 1 meter = 39.3701 inches

        return meters * meters2inches;
        // Converts meters to inches
    }

    public static double convertInchesToMeters(double inches) {

        double inches2meters = 0.0254;
        // Conversion factor: 1 inch = 0.0254 meters

        return inches * inches2meters;
        // Converts inches to meters
    }

    public static double convertInchesToCm(double inches) {

        double inches2cm = 2.54;
        // Conversion factor: 1 inch = 2.54 cm

        return inches * inches2cm;
        // Converts inches to cm
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object

        System.out.println("Enter the yards");
        // Prompts for yards

        double yards = scan.nextDouble();
        // Reads yards

        System.out.println("Enter the feet");
        // Prompts for feet

        double feet = scan.nextDouble();
        // Reads feet

        System.out.println("Enter the meters");
        // Prompts for meters

        double meters = scan.nextDouble();
        // Reads meters

        System.out.println("Enter the inches");
        // Prompts for inches

        double inches = scan.nextDouble();
        // Reads inches

        System.out.println("convertYardsToFeet " + convertYardsToFeet(yards));
        // Displays yards → feet

        System.out.println("convertFeetToYards " + convertFeetToYards(feet));
        // Displays feet → yards

        System.out.println("convertMetersToInches " + convertMetersToInches(meters));
        // Displays meters → inches

        System.out.println("convertInchesToCm " + convertInchesToCm(inches));
        // Displays inches → cm

        scan.close();
        // Closes Scanner
    }
}