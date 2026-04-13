package programming_elements.level1;
import java.util.*;

public class TriangleAreaCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        double base;
        // Declares variable to store base of the triangle

        double height;
        // Declares variable to store height of the triangle

        System.out.print("Enter base of triangle: ");
        // Prompts user to enter base

        base = input.nextDouble();
        // Reads base value from user

        System.out.print("Enter height of triangle: ");
        // Prompts user to enter height

        height = input.nextDouble();
        // Reads height value from user

        double area = 0.5 * base * height;
        // Calculates area using formula (1/2 × base × height)

        System.out.println("The area of triangle is " + area + " square units");
        // Displays the calculated area
    }
}