package arrays.level2;
import java.util.*;

public class BMIMultiDimensional {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        int number;
        // Stores number of persons

        System.out.print("Enter number of persons: ");
        // Prompts user

        number = input.nextInt();
        // Reads number of persons

        double[][] personData = new double[number][3];
        // 2D array → [i][0]=weight, [i][1]=height, [i][2]=BMI

        String[] weightStatus = new String[number];
        // Array to store BMI category for each person

        for (int i = 0; i < number; i++) {

            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            // Input weight

            personData[i][0] = input.nextDouble();
            // Store weight

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            // Input height

            personData[i][1] = input.nextDouble();
            // Store height

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                // Validate input

                System.out.println("Invalid input. Enter positive values.");
                i--;
                // Re-enter same person data
            }
        }

        for (int i = 0; i < number; i++) {

            double heightMeter = personData[i][1] / 100;
            // Convert cm → meters

            personData[i][2] = personData[i][0] / (heightMeter * heightMeter);
            // Calculate BMI

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
            // Assign BMI category
        }

        for (int i = 0; i < number; i++) {

            System.out.println("Person " + (i + 1) +
                    " Height: " + personData[i][1] +
                    " Weight: " + personData[i][0] +
                    " BMI: " + personData[i][2] +
                    " Status: " + weightStatus[i]);
            // Displays all details
        }

        input.close();
        // Closes Scanner
    }
}