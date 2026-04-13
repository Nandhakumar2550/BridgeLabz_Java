package control_flows.level1;
import java.sql.SQLOutput;
import java.util.*;

public class EmployeeBonusCalculator {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the salary");
        // Prompts user to enter salary

        int salary = scan.nextInt();
        // Reads salary value

        System.out.println("Enter the year of experience");
        // Prompts user to enter years of experience

        int year = scan.nextInt();
        // Reads experience value

        double bonuspercentage = 5.0;
        // Bonus percentage (fixed at 5%)

        double bonusamount = 0.0;
        // Initializes bonus amount to 0

        if(year > 5){
            // Checks if experience is greater than 5 years

            bonusamount = (bonuspercentage / 100) * salary;
            // Calculates bonus amount
        }

        System.out.println(bonusamount);
        // Displays bonus amount

        scan.close();
        // Closes Scanner to prevent resource leak
    }
}