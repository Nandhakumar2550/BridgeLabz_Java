package arrays.level2;
import java.util.*;

public class EmployeeBonusSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        int numberOfEmployees = 10;
        // Fixed number of employees

        double[] salary = new double[numberOfEmployees];
        // Array to store salaries

        double[] yearsOfService = new double[numberOfEmployees];
        // Array to store years of service

        double[] bonus = new double[numberOfEmployees];
        // Array to store calculated bonus

        double[] newSalary = new double[numberOfEmployees];
        // Array to store updated salary

        double totalBonus = 0.0;
        // Stores total bonus payout

        double totalOldSalary = 0.0;
        // Stores total old salary

        double totalNewSalary = 0.0;
        // Stores total new salary

        for (int i = 0; i < numberOfEmployees; i++) {

            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            // Input salary

            salary[i] = input.nextDouble();
            // Store salary

            System.out.print("Enter years of service: ");
            // Input years of service

            yearsOfService[i] = input.nextDouble();
            // Store years

            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                // Validate input

                System.out.println("Invalid input. Please enter again.");
                i--;
                // Repeat same index
            }
        }

        for (int i = 0; i < numberOfEmployees; i++) {

            if (yearsOfService[i] > 5) {
                // Check experience condition

                bonus[i] = salary[i] * 0.05;
                // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02;
                // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];
            // Calculate updated salary

            totalBonus += bonus[i];
            // Add to total bonus

            totalOldSalary += salary[i];
            // Add to total old salary

            totalNewSalary += newSalary[i];
            // Add to total new salary
        }

        System.out.println("Total Bonus Payout = " + totalBonus);
        // Displays total bonus

        System.out.println("Total Old Salary = " + totalOldSalary);
        // Displays total old salary

        System.out.println("Total New Salary = " + totalNewSalary);
        // Displays total new salary

        input.close();
        // Closes Scanner
    }
}