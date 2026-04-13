package arrays.level2;
import java.util.*;

public class BMIMultiplePersons {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        int numberOfPersons;
        // Stores number of persons

        System.out.print("Enter number of persons: ");
        // Prompts user

        numberOfPersons = input.nextInt();
        // Reads number of persons

        double[] weight = new double[numberOfPersons];
        // Array to store weights

        double[] height = new double[numberOfPersons];
        // Array to store heights

        double[] bmi = new double[numberOfPersons];
        // Array to store BMI values

        String[] status = new String[numberOfPersons];
        // Array to store BMI category

        for (int i = 0; i < numberOfPersons; i++) {

            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            // Input weight

            weight[i] = input.nextDouble();
            // Store weight

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            // Input height

            height[i] = input.nextDouble();
            // Store height

            if (weight[i] <= 0 || height[i] <= 0) {
                // Validate input

                System.out.println("Invalid input. Enter positive values.");
                i--;
                // Re-enter same index
            }
        }

        for (int i = 0; i < numberOfPersons; i++) {

            double heightInMeter = height[i] / 100;
            // Convert cm → meters

            bmi[i] = weight[i] / (heightInMeter * heightInMeter);
            // Calculate BMI

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
            // Assign BMI category
        }

        for (int i = 0; i < numberOfPersons; i++) {

            System.out.println("Person " + (i + 1) +
                    " Height: " + height[i] +
                    " Weight: " + weight[i] +
                    " BMI: " + bmi[i] +
                    " Status: " + status[i]);
            // Displays result
        }

        input.close();
        // Closes Scanner
    }
}