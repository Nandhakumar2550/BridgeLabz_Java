package programming_elements.level1;
import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        double km;
        // Declares variable to store distance in kilometers

        double conversionFactor = 1.6;
        // Conversion factor (1 mile = 1.6 km)

        System.out.print("Enter distance in km: ");
        // Prompts user to enter distance

        km = input.nextDouble();
        // Reads distance value from user

        double miles = km / conversionFactor;
        // Converts kilometers to miles

        System.out.println("The total miles is " + miles +
                " mile for the given " + km + " km");
        // Displays the converted result
    }
}