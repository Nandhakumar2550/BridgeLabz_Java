package programming_elements.level1;
import java.util.*;

public class SquareSideCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        double perimeter;
        // Declares variable to store perimeter of the square

        System.out.print("Enter the perimeter of square: ");
        // Prompts user to enter perimeter

        perimeter = input.nextDouble();
        // Reads perimeter value from user

        double side = perimeter / 4;
        // Calculates side length of square (side = perimeter / 4)

        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);
        // Displays the side length and given perimeter
    }
}