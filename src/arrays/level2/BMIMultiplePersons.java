package arrays.level2;
import java.util.*;
public class BMIMultiplePersons {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfPersons;

        System.out.print("Enter number of persons: ");
        numberOfPersons = input.nextInt();

        double[] weight = new double[numberOfPersons];
        double[] height = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] status = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {

            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weight[i] = input.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            height[i] = input.nextDouble();

            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid input. Enter positive values.");
                i--;
            }
        }

        for (int i = 0; i < numberOfPersons; i++) {

            double heightInMeter = height[i] / 100;
            bmi[i] = weight[i] / (heightInMeter * heightInMeter);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) +
                    " Height: " + height[i] +
                    " Weight: " + weight[i] +
                    " BMI: " + bmi[i] +
                    " Status: " + status[i]);
        }
    }
}
