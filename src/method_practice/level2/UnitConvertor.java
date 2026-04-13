package method_practice.level2;
import java.util.*;

public class UnitConvertor {

    public static double convertKmToMiles(double km) {

        double km2miles = 0.621371;
        // Conversion factor from km to miles

        return km * km2miles;
        // Converts km to miles
    }

    public static double convertMilesToKm(double miles) {

        double miles2km = 1.60934;
        // Conversion factor from miles to km

        return miles * miles2km;
        // Converts miles to km
    }

    public static double convertMetersToFeet(double meters) {

        double meters2feet = 3.28084;
        // Conversion factor from meters to feet

        return meters * meters2feet;
        // Converts meters to feet
    }

    public static double convertFeetToMeters(double feet) {

        double feet2meters = 0.3048;
        // Conversion factor from feet to meters

        return feet * feet2meters;
        // Converts feet to meters
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object

        System.out.println("Enter the km");
        // Prompts user for km

        double km = scan.nextDouble();
        // Reads km

        System.out.println("Enter the miles");
        // Prompts user for miles

        double miles = scan.nextDouble();
        // Reads miles

        System.out.println("Enter the meters");
        // Prompts user for meters

        double meters = scan.nextDouble();
        // Reads meters

        System.out.println("Enter the feet");
        // Prompts user for feet

        double feet = scan.nextDouble();
        // Reads feet

        System.out.println("convertKmToMiles " + convertKmToMiles(km));
        // Displays km → miles

        System.out.println("convertmilestokm " + convertMilesToKm(miles));
        // Displays miles → km

        System.out.println("convertMeterstofeet " + convertMetersToFeet(meters));
        // Displays meters → feet

        System.out.println("convertfeettometers " + convertFeetToMeters(feet));
        // Displays feet → meters

        scan.close();
        // Closes Scanner
    }
}