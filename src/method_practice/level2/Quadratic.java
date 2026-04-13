package method_practice.level2;
import java.util.*;

public class Quadratic {

    public static double[] findRoots(double a, double b, double c) {

        double delta = Math.pow(b, 2) - 4 * a * c;
        // Calculates discriminant (b² - 4ac)

        if (delta > 0) {
            // Two distinct real roots

            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            // Calculates first root

            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            // Calculates second root

            return new double[]{root1, root2};
            // Returns both roots
        }

        else if (delta == 0) {
            // One real root (repeated)

            double root = -b / (2 * a);
            // Calculates single root

            return new double[]{root};
            // Returns one root
        }

        else {
            // No real roots (complex roots case)

            return new double[0];
            // Returns empty array
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        System.out.print("Enter a: ");
        // Prompts user

        double a = input.nextDouble();
        // Reads coefficient a

        System.out.print("Enter b: ");
        // Prompts user

        double b = input.nextDouble();
        // Reads coefficient b

        System.out.print("Enter c: ");
        // Prompts user

        double c = input.nextDouble();
        // Reads coefficient c

        double[] roots = findRoots(a, b, c);
        // Calls method to find roots

        if (roots.length == 2)
            System.out.println("Roots: " + roots[0] + ", " + roots[1]);
            // Prints two roots

        else if (roots.length == 1)
            System.out.println("One Root: " + roots[0]);
            // Prints one root

        else
            System.out.println("No Real Roots");
        // Handles complex roots case

        input.close();
        // Closes Scanner
    }
}