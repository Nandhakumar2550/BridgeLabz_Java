package programming_elements.level1;
import java.util.*;
public class TriangleAreaCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base;
        double height;

        System.out.print("Enter base of triangle: ");
        base = input.nextDouble();

        System.out.print("Enter height of triangle: ");
        height = input.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("The area of triangle is " + area + " square units");
    }
}
