package method_practice.level3;
import java.util.Scanner;

public class GeometryCalculator {

    public static double calculateDistance(
            double x1, double y1,
            double x2, double y2) {

        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2));
        // Calculates distance using distance formula
    }

    public static double[] findLineEquation(
            double x1, double y1,
            double x2, double y2) {

        double slope = (y2 - y1) / (x2 - x1);
        // Calculates slope of line

        double intercept = y1 - slope * x1;
        // Calculates y-intercept (c)

        return new double[]{slope, intercept};
        // Returns slope and intercept
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        System.out.print("Enter x1 y1: ");
        // Prompts for first point

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        // Reads first point

        System.out.print("Enter x2 y2: ");
        // Prompts for second point

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        // Reads second point

        double distance = calculateDistance(x1, y1, x2, y2);
        // Calculates distance

        double[] line = findLineEquation(x1, y1, x2, y2);
        // Calculates line equation

        System.out.println("Distance = " + distance);
        // Displays distance

        System.out.println("Line Equation: y = "
                + line[0] + "x + " + line[1]);
        // Displays equation of line

        input.close();
        // Closes Scanner
    }
}