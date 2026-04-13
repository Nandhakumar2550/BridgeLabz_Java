package strings.level3;

import java.util.Scanner;

public class TeamBMI {

    public static String getBMIStatus(double bmi) {

        // Determine BMI category based on standard ranges
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";

        // BMI 30 and above
        return "Obese";
    }

    public static String[][] calculateBMI(double[][] data) {

        // Result array: height, weight, BMI, status
        String[][] result = new String[data.length][4];

        // Loop through all persons
        for (int i = 0; i < data.length; i++) {

            // Extract weight in kg
            double weight = data[i][0];

            // Convert height from cm to meters
            double heightMeters = data[i][1] / 100.0;

            // BMI formula: weight / (height * height)
            double bmi = weight / (heightMeters * heightMeters);

            // Round BMI to 2 decimal places
            bmi = Math.round(bmi * 100) / 100.0;

            // Store height (cm)
            result[i][0] = String.valueOf(data[i][1]);

            // Store weight
            result[i][1] = String.valueOf(weight);

            // Store BMI
            result[i][2] = String.valueOf(bmi);

            // Store BMI category
            result[i][3] = getBMIStatus(bmi);
        }

        return result;
    }

    public static void display(String[][] data) {

        // Print table header
        System.out.println("Height(cm)\tWeight\tBMI\tStatus");

        // Display each person's BMI details
        for (int i = 0; i < data.length; i++) {

            System.out.println(data[i][0] + "\t\t" +
                    data[i][1] + "\t" +
                    data[i][2] + "\t" +
                    data[i][3]);
        }
    }

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Array to store weight and height for 10 persons
        double[][] persons = new double[10][2];

        // Input loop for 10 people
        for (int i = 0; i < 10; i++) {

            // Input weight in kg
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            persons[i][0] = input.nextDouble();

            // Input height in cm
            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            persons[i][1] = input.nextDouble();
        }

        // Calculate BMI and status
        String[][] result = calculateBMI(persons);

        // Display final report
        display(result);
    }
}