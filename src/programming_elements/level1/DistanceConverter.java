package programming_elements.level1;
import java.util.*;

public class DistanceConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        double distanceInFeet;
        // Declares variable to store distance in feet

        System.out.print("Enter distance in feet: ");
        // Prompts user to enter distance

        distanceInFeet = input.nextDouble();
        // Reads distance value from user

        double yards = distanceInFeet / 3;
        // Converts feet to yards (1 yard = 3 feet)

        double miles = yards / 1760;
        // Converts yards to miles (1 mile = 1760 yards)

        System.out.println("Distance in feet is " + distanceInFeet +
                ", in yards is " + yards +
                " and in miles is " + miles);
        // Displays the converted values
    }
}