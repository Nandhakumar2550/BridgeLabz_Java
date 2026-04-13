package method_practice.level1;
import java.util.*;

public class AthleteRoundsCalculator {

    public static double calculate(double side1, double side2, double side3){

        double perimeter = side1 + side2 + side3;
        // Calculates perimeter of the triangular track

        int totaldistance = 5000;
        // Total distance to be covered (5 km = 5000 meters)

        double result = totaldistance / perimeter;
        // Calculates number of rounds required

        return result;
        // Returns number of rounds
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the side1");
        // Prompts user for side1

        double side1 = scan.nextDouble();
        // Reads side1

        System.out.println("Enter the side2");
        // Prompts user for side2

        double side2 = scan.nextDouble();
        // Reads side2

        System.out.println("Enter the side3");
        // Prompts user for side3

        double side3 = scan.nextDouble();
        // Reads side3

        double result = calculate(side1, side2, side3);
        // Calls method to calculate rounds

        System.out.println("Number of rounds needed = " + result);
        // Displays result

        scan.close();
        // Closes Scanner
    }
}