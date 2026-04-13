package control_flows.level2;
import java.util.*;

public class LeapYearChecker {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the year ");
        // Prompts user to enter a year

        int year = scan.nextInt();
        // Reads the year

        if(year < 1582){
            // Checks if year is before Gregorian calendar adoption

            System.out.println("Leap year calculation is valid only for year >= 1582");

        } else {
            // Proceeds with leap year calculation

            if(year % 4 == 0){
                // Checks if divisible by 4

                if(year % 100 == 0){
                    // Checks if divisible by 100

                    if(year % 400 == 0){
                        // Checks if divisible by 400

                        System.out.println("It is an Leap year");
                        // Leap year

                    } else {
                        System.out.println("Year is not a Leap Year");
                        // Not a leap year
                    }

                } else {
                    System.out.println("Year is  a Leap Year");
                    // Leap year (divisible by 4 but not 100)
                }

            } else {
                System.out.println("Year is not a Leap Year");
                // Not divisible by 4 → not a leap year
            }
        }

        scan.close();
        // Closes Scanner
    }
}