package programming_elements.level2;
import java.util.*;

public class DoubleOperation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        double a;
        double b;
        double c;
        // Declares three double variables

        System.out.print("Enter value of a: ");
        // Prompts user to enter value of a

        a = input.nextDouble();
        // Reads value of a

        System.out.print("Enter value of b: ");
        // Prompts user to enter value of b

        b = input.nextDouble();
        // Reads value of b

        System.out.print("Enter value of c: ");
        // Prompts user to enter value of c

        c = input.nextDouble();
        // Reads value of c

        double result1 = a + b * c;
        // Evaluates expression using operator precedence (* before +)

        double result2 = a * b + c;
        // Multiplies a and b first, then adds c

        double result3 = c + a / b;
        // Divides a by b first, then adds c

        double result4 = a % b + c;
        // Finds remainder of a divided by b, then adds c

        System.out.println("The results of Double Operations are "
                + result1 + ", "
                + result2 + ", "
                + result3 + ", and "
                + result4);
        // Displays all calculated results
    }
}