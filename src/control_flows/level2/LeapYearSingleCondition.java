package control_flows.level2;
import java.util.*;

public class LeapYearSingleCondition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the year");
        // Prompts user to enter a year

        int year = scan.nextInt();
        // Reads the year

        boolean isleap = (year >= 1582) &&
                ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        // Checks leap year using single condition:
        // - Year must be >= 1582
        // - Divisible by 4 and not 100 OR divisible by 400

        if(isleap){
            // If condition is true

            System.out.println("Its is an leap year");
            // Prints leap year message

        } else {
            // If condition is false

            System.out.println("Its is not an leap year");
            // Prints not leap year message
        }

        scan.close();
        // Closes Scanner
    }
}