package method_practice.level2;
import java.util.*;

public class LeapYearChecker {

    public static boolean isleapYear(int year){

        if(year < 1582){
            // Gregorian calendar starts from 1582

            return false;
            // Not valid for leap year calculation

        } else if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            // Checks leap year condition

            return true;
            // Leap year

        }

        return false;
        // Not a leap year
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take input

        System.out.print("Enter year: ");
        // Prompts user to enter year

        int year = input.nextInt();
        // Reads year

        if(isleapYear(year)){
            // Calls method to check leap year

            System.out.println("leap year");
            // Prints leap year

        } else {
            System.out.println("Not an Leap year");
            // Prints not leap year
        }

        input.close();
        // Closes Scanner
    }
}