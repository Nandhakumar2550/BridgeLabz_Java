package method_practice.level2;
import java.util.*;

public class BMIMethodProgram {

    public static void bmi(double[][] arr){

        for(int i = 0; i < arr.length; i++){
            // Iterates through each person

            double heightcm = arr[i][0];
            // Gets height in cm

            double weight = arr[i][1];
            // Gets weight in kg

            double heightm = heightcm / 100;
            // Converts height from cm to meters

            arr[i][2] = weight / (heightm * heightm);
            // Calculates BMI and stores in array
        }
    }

    public static String[] findbmistatus(double[][] arr){

        String[] status = new String[arr.length];
        // Creates array to store BMI status

        for(int i = 0; i < arr.length; i++) {

            double bmi = arr[i][2];
            // Gets BMI value

            if (bmi < 18.5)
                status[i] = "Underweight";

            else if (bmi < 25)
                status[i] = "Normal";

            else if (bmi < 30)
                status[i] = "Overweight";

            else
                status[i] = "Obese";
        }

        return status;
        // Returns BMI status array
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object for input

        double[][] arr = new double[10][3];
        // 2D array: [height, weight, BMI]

        for(int i = 0; i < 10; i++){

            System.out.println("Enter the height" + i+1);
            // Prompts for height

            arr[i][0] = scan.nextDouble();
            // Reads height

            System.out.println("Enter the weight" + i+1);
            // Prompts for weight

            arr[i][1] = scan.nextDouble();
            // Reads weight

            if(arr[i][0] <= 0 || arr[i][1] <= 0){
                // Validates input

                System.out.println("Enter the valid number");
                // Displays error message

                i--;
                // Repeats same index input
            }
        }

        bmi(arr);
        // Calculates BMI for all persons

        String[] status = findbmistatus(arr);
        // Gets BMI status for all persons

        for(int i = 0; i < arr.length; i++) {

            System.out.println("Person " + (i + 1) +
                    " Weight: " + arr[i][0] +
                    " Height: " + arr[i][1] +
                    " BMI: " + arr[i][2] +
                    " Status: " + status[i]);
            // Displays details for each person
        }

        scan.close();
        // Closes Scanner
    }
}