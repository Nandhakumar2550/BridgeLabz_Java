package method_practice.level1;
import java.util.*;

public class SimpleInterestCalculator {

    public static double calculateSimpleInterest(double principalamount, double rate, double time){

        double si = (principalamount * rate * time) / 100;
        // Calculates simple interest using formula (P × R × T) / 100

        return si;
        // Returns calculated simple interest
    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter Principal: ");
        // Prompts user to enter principal amount

        double principalamount = scan.nextDouble();
        // Reads principal amount

        System.out.println("Enter Rate of Interest: ");
        // Prompts user to enter rate

        double rate = scan.nextDouble();
        // Reads rate

        System.out.println("Enter Time: ");
        // Prompts user to enter time

        double time = scan.nextDouble();
        // Reads time

        double result = calculateSimpleInterest(principalamount, rate, time);
        // Calls method to calculate simple interest

        System.out.println("The Simple Interest is " + result +
                " for Principal " + principalamount +
                ", Rate of Interest " + rate +
                " and Time " + time);
        // Displays result with details

        scan.close();
        // Closes Scanner
    }
}