package arrays.level2;
import java.util.*;
public class EmployeeBonusSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfEmployees = 10;

        double[] salary = new double[numberOfEmployees];
        double[] yearsOfService = new double[numberOfEmployees];
        double[] bonus = new double[numberOfEmployees];
        double[] newSalary = new double[numberOfEmployees];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < numberOfEmployees; i++) {

            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = input.nextDouble();

            System.out.print("Enter years of service: ");
            yearsOfService[i] = input.nextDouble();

            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
            }
        }

        for (int i = 0; i < numberOfEmployees; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}
