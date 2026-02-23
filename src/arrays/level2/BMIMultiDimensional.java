package arrays.level2;
import java.util.*;
public class BMIMultiDimensional {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter number of persons: ");
        number = input.nextInt();

        double[][] personData = new double[number][3]; // weight, height, BMI
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input. Enter positive values.");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {

            double heightMeter = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (heightMeter * heightMeter);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {

            System.out.println("Person " + (i + 1) +
                    " Height: " + personData[i][1] +
                    " Weight: " + personData[i][0] +
                    " BMI: " + personData[i][2] +
                    " Status: " + weightStatus[i]);
        }
    }
}
