package programming_elements.level2;
import java.util.*;

public class WeightConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        double weightInPounds;
        // Declares variable to store weight in pounds

        double conversionFactor = 2.2;
        // Conversion factor (1 kg = 2.2 pounds)

        System.out.print("Enter weight in pounds: ");
        // Prompts user to enter weight

        weightInPounds = input.nextDouble();
        // Reads weight value from user

        double weightInKg = weightInPounds / conversionFactor;
        // Converts pounds to kilograms

        System.out.println("The weight of the person in pound is "
                + weightInPounds +
                " and in kg is " + weightInKg);
        // Displays weight in pounds and kilograms
    }
}