package control_flows.level3;
import java.util.*;

public class DigitCounter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number ");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        int count = 0;
        // Initializes digit counter

        while(num > 0){
            // Loop runs until number becomes 0

            num = num / 10;
            // Removes last digit

            count++;
            // Increments digit count
        }

        System.out.println(count);
        // Displays total number of digits

        scan.close();
        // Closes Scanner
    }
}