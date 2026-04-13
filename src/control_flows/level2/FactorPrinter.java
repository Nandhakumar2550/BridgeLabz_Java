package control_flows.level2;
import java.util.*;

public class FactorPrinter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the Number");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        for(int i = 1; i < num; i++){
            // Loops from 1 to (num - 1)

            if(num % i == 0){
                // Checks if i is a factor of num

                System.out.println(i);
                // Prints the factor
            }
        }

        scan.close();
        // Closes Scanner
    }
}