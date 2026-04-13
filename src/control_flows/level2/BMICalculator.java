package control_flows.level2;
import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the height in cm");
        // Prompts user to enter height in centimeters

        double height = scan.nextDouble();
        // Reads height value

        System.out.println("Enter the weight in kg");
        // Prompts user to enter weight in kilograms

        double weight = scan.nextDouble();
        // Reads weight value

        double heightinmeter = height / 100;
        // Converts height from cm to meters

        double bmi = weight / (heightinmeter * heightinmeter);
        // Calculates BMI using formula weight / (height^2)

        String result;
        // Declares variable to store BMI category

        if(bmi < 18.5){
            // Checks for underweight

            result = "Underweight";

        } else if(bmi < 25){
            // Checks for normal weight

            result = "Normalweight";

        } else if(bmi < 30){
            // Checks for overweight

            result = "overweight";

        } else {
            // For BMI 30 and above

            result = "obse";
        }

        System.out.println("BMI " + bmi);
        // Displays BMI value

        System.out.println("Status " + result);
        // Displays BMI category

        scan.close();
        // Closes Scanner
    }
}