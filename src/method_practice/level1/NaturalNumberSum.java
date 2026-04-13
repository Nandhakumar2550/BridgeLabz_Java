package method_practice.level1;
import java.util.*;

public class NaturalNumberSum {

    public static int calculateSum(int num){

        int sum = 0;
        // Initializes sum variable

        for(int i = 0; i <= num; i++){
            // Loops from 0 to given number

            sum += i;
            // Adds each number to sum
        }

        return sum;
        // Returns final sum
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.print("Enter a natural number: ");
        // Prompts user to enter number

        int number = scan.nextInt();
        // Reads number

        int sum = calculateSum(number);
        // Calls method to calculate sum

        System.out.println("Sum of " + number + " natural numbers is " + sum);
        // Displays result

        scan.close();
        // Closes Scanner
    }
}