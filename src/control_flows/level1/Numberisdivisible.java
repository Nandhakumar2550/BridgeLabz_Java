package control_flows.level1;
import java.util.*;

public class Numberisdivisible {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number ");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        boolean isdivisible = (num % 5 == 0);
        // Checks if the number is divisible by 5

        System.out.println("Is the number " + num +
                " divisible by 5? " + isdivisible);
        // Displays the result (true/false)

        scan.close();
        // Closes Scanner
    }
}