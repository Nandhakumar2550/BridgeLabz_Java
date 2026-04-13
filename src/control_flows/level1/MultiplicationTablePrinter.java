package control_flows.level1;
import java.util.*;

public class MultiplicationTablePrinter {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        for(int i = 6; i <= 9; i++){
            // Loop runs from 6 to 9

            int result = num * i;
            // Multiplies the number with current value of i

            System.out.println(result);
            // Prints the multiplication result
        }

        scan.close();
        // Closes Scanner
    }
}