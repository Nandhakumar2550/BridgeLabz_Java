package control_flows.level2;
import java.util.*;

public class PowerCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number ");
        // Prompts user to enter the base number

        int num = scan.nextInt();
        // Reads the base number

        System.out.println("Enter the power");
        // Prompts user to enter the exponent

        int power = scan.nextInt();
        // Reads the power value

        int result = 1;
        // Initializes result (anything power 0 = 1)

        for(int i = 1; i <= power; i++){
            // Loop runs 'power' times

            result = result * num;
            // Multiplies base number repeatedly
        }

        System.out.println(result);
        // Displays the final result

        scan.close();
        // Closes Scanner
    }
}