package programming_elements.level2;
import java.util.*;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        double principal;
        double rate;
        double time;
        // Declares variables for principal, rate, and time

        System.out.print("Enter Principal amount: ");
        // Prompts user to enter principal amount

        principal = input.nextDouble();
        // Reads principal value

        System.out.print("Enter Rate of Interest: ");
        // Prompts user to enter rate of interest

        rate = input.nextDouble();
        // Reads rate value

        System.out.print("Enter Time period: ");
        // Prompts user to enter time period

        time = input.nextDouble();
        // Reads time value

        double simpleInterest = (principal * rate * time) / 100;
        // Calculates simple interest using formula (P × R × T) / 100

        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
        // Displays the calculated simple interest with details
    }
}