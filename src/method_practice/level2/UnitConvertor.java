package method_practice.level2;
import java.util.*;
public class UnitConvertor {
        public static double convertKmToMiles(double km) {
            double km2miles = 0.621371;
            return km * km2miles;
        }

        public static double convertMilesToKm(double miles) {
            double miles2km = 1.60934;
            return miles * miles2km;
        }

        public static double convertMetersToFeet(double meters) {
            double meters2feet = 3.28084;
            return meters * meters2feet;
        }

        public static double convertFeetToMeters(double feet) {
            double feet2meters = 0.3048;
            return feet * feet2meters;
        }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the km");
        double km=scan.nextDouble();
        System.out.println("Enter the miles");
        double miles=scan.nextDouble();
        System.out.println("Enter the meters");
        double meters=scan.nextDouble();
        System.out.println("Enter the feet");
        double feet=scan.nextDouble();
        System.out.println("convertKmToMiles " + convertKmToMiles(km));
        System.out.println("convertmilestokm " + convertMilesToKm( miles));
        System.out.println("convertMeterstofeet " + convertMetersToFeet(meters));
        System.out.println("convertfeettometers " + convertFeetToMeters(feet));
    }
}
