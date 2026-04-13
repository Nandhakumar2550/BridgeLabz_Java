package programming_elements.level1;
import java.util.*;

public class HeightConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        double heightInCm;
        // Declares variable to store height in centimeters

        System.out.print("Enter height in centimeters: ");
        // Prompts user to enter height

        heightInCm = input.nextDouble();
        // Reads height value from user

        double totalInches = heightInCm / 2.54;
        // Converts centimeters to inches (1 inch = 2.54 cm)

        int feet = (int) (totalInches / 12);
        // Converts inches to feet (1 foot = 12 inches)

        double remainingInches = totalInches % 12;
        // Calculates remaining inches after converting to feet

        System.out.println("Your Height in cm is " + heightInCm +
                " while in feet is " + feet +
                " and inches is " + remainingInches);
        // Displays the converted height
    }
}