package method_practice.level3;
import java.util.Scanner;

public class CollinearChecker {

    public static boolean isCollinearSlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double slopeAB = (y2 - y1) / (x2 - x1);
        // Calculates slope between A and B

        double slopeAC = (y3 - y1) / (x3 - x1);
        // Calculates slope between A and C

        return slopeAB == slopeAC;
        // Checks if slopes are equal
    }

    public static boolean isCollinearArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double area = 0.5 * (
                x1 * (y2 - y3) +
                        x2 * (y3 - y1) +
                        x3 * (y1 - y2));
        // Calculates area of triangle formed by 3 points

        return area == 0;
        // If area is 0 → points are collinear
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        System.out.println("Enter x1 y1:");
        // Prompts user

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        // Reads first point

        System.out.println("Enter x2 y2:");
        // Prompts user

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        // Reads second point

        System.out.println("Enter x3 y3:");
        // Prompts user

        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        // Reads third point

        System.out.println("Collinear (Slope)? "
                + isCollinearSlope(x1,y1,x2,y2,x3,y3));
        // Checks using slope method

        System.out.println("Collinear (Area)? "
                + isCollinearArea(x1,y1,x2,y2,x3,y3));
        // Checks using area method

        input.close();
        // Closes Scanner
    }
}