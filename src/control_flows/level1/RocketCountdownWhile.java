package control_flows.level1;
import java.util.*;

public class RocketCountdownWhile {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number");
        // Prompts user to enter starting countdown number

        int count = scan.nextInt();
        // Reads countdown starting value

        while(count > 0){
            // Loop runs until count becomes 0

            System.out.println(count);
            // Prints current countdown value

            count--;
            // Decrements count
        }

        System.out.println("Rocked Lanched");
        // Prints message after countdown ends

        scan.close();
        // Closes Scanner
    }
}