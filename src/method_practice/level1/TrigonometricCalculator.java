package method_practice.level1;
import java.util.*;

public class TrigonometricCalculator {

    public static double[] calculateTrigonometricFunctions(double angle){

        double radian = Math.toRadians(angle);
        // Converts angle from degrees to radians

        double sine = Math.sin(radian);
        // Calculates sine of the angle

        double cosine = Math.cos(radian);
        // Calculates cosine of the angle

        double tangent = Math.tan(radian);
        // Calculates tangent of the angle

        return new double[]{sine, cosine, tangent};
        // Returns all three values as an array
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.print("Enter angle in degrees: ");
        // Prompts user to enter angle

        double angle = input.nextDouble();
        // Reads angle value

        double[] results = calculateTrigonometricFunctions(angle);
        // Calls method to compute trigonometric values

        System.out.println("Sine = " + results[0]);
        // Displays sine value

        System.out.println("Cosine = " + results[1]);
        // Displays cosine value

        System.out.println("Tangent = " + results[2]);
        // Displays tangent value

        input.close();
        // Closes Scanner
    }
}