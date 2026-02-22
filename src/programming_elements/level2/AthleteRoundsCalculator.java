package programming_elements.level2;
import java.util.*;
public class AthleteRoundsCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double side1;
        double side2;
        double side3;

        double totalDistanceInMeters = 5000;

        System.out.print("Enter side1 in meters: ");
        side1 = input.nextDouble();

        System.out.print("Enter side2 in meters: ");
        side2 = input.nextDouble();

        System.out.print("Enter side3 in meters: ");
        side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3;

        double rounds = totalDistanceInMeters / perimeter;

        System.out.println("The total number of rounds the athlete will run is "
                + rounds + " to complete 5 km");
    }
}
