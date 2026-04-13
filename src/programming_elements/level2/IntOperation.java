package programming_elements.level2;
import java.util.*;

public class IntOperation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        int a;
        int b;
        int c;
        // Declares three integer variables

        System.out.print("Enter value of a: ");
        // Prompts user to enter value of a

        a = input.nextInt();
        // Reads value of a

        System.out.print("Enter value of b: ");
        // Prompts user to enter value of b

        b = input.nextInt();
        // Reads value of b

        System.out.print("Enter value of c: ");
        // Prompts user to enter value of c

        c = input.nextInt();
        // Reads value of c

        int result1 = a + b * c;
        // Evaluates expression with operator precedence (* before +)

        int result2 = a * b + c;
        // Multiplies a and b first, then adds c

        int result3 = c + a / b;
        // Divides a by b first (integer division), then adds c

        int result4 = a % b + c;
        // Finds remainder of a divided by b, then adds c

        System.out.println("The results of Int Operations are "
                + result1 + ", "
                + result2 + ", "
                + result3 + ", and "
                + result4);
        // Displays all calculated results
    }
}