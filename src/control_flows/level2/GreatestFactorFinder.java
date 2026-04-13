package control_flows.level2;
import java.util.*;

public class GreatestFactorFinder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        int greatestfactor = 1;
        // Initializes greatest factor (default is 1)

        for(int i = num - 1; i >= 1; i--){
            // Loops from (num-1) down to 1

            if(num % i == 0){
                // Checks if i is a factor of num

                greatestfactor = i;
                // Assigns the first (largest) factor found

                break;
                // Exits loop once greatest factor is found
            }
        }

        System.out.println(greatestfactor);
        // Displays the greatest factor (excluding the number itself)

        scan.close();
        // Closes Scanner
    }
}