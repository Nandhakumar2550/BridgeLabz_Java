package control_flows.level3;
import java.sql.SQLOutput;
import java.util.*;

public class AbundantNumberChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        int sum = 0;
        // Initializes sum of factors

        for(int i = 1; i < num; i++){
            // Loops from 1 to (num - 1)

            if(num % i == 0){
                // Checks if i is a factor of num

                sum = sum + i;
                // Adds factor to sum
            }
        }

        if(sum > num){
            // Checks if sum of factors is greater than number

            System.out.println("The number is an Abundant");
            // Number is abundant

        } else {
            System.out.println("The number is not Abundant");
            // Number is not abundant
        }

        scan.close();
        // Closes Scanner
    }
}