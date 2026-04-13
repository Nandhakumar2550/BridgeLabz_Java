package control_flows.level1;
import java.util.*;

public class OddEvenPrinter {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        if(num > 0){
            // Checks if the number is a natural number

            for(int i = 1; i <= num; i++){
                // Loops from 1 to the given number

                if(i % 2 == 0){
                    // Checks if current number is even

                    System.out.println("Number is even");
                    // Prints even message

                } else {
                    // Executes when number is odd

                    System.out.println("Number is odd");
                    // Prints odd message
                }
            }

        } else {
            System.out.println("Entered Number is not an Natural number");
            // Handles invalid input
        }

        scan.close();
        // Closes Scanner
    }
}