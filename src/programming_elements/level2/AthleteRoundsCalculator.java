package programming_elements.level2;
import java.util.*;

public class AthleteRoundsCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        double side1;
        double side2;
        double side3;
        // Declares variables to store the three sides of the triangular track

        double totalDistanceInMeters = 5000;
        // Total distance to be covered (5 km = 5000 meters)

        System.out.print("Enter side1 in meters: ");
        // Prompts user to enter first side

        side1 = input.nextDouble();
        // Reads first side value

        System.out.print("Enter side2 in meters: ");
        // Prompts user to enter second side

        side2 = input.nextDouble();
        // Reads second side value

        System.out.print("Enter side3 in meters: ");
        // Prompts user to enter third side

        side3 = input.nextDouble();
        // Reads third side value

        double perimeter = side1 + side2 + side3;
        // Calculates perimeter of the triangular track

        double rounds = totalDistanceInMeters / perimeter;
        // Calculates number of rounds required to complete 5 km

        System.out.println("The total number of rounds the athlete will run is "
                + rounds + " to complete 5 km");
        // Displays the number of rounds
    }
}