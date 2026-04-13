package control_flows.level2;
import java.sql.SQLOutput;
import java.util.*;

public class MultiplesBelowHundred {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enyter the number");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        for(int i = 100; i >= 1; i--){
            // Loops from 100 down to 1

            if(i % num == 0){
                // Checks if i is a multiple of the given number

                System.out.println(i);
                // Prints the multiple
            }
        }

        scan.close();
        // Closes Scanner
    }
}