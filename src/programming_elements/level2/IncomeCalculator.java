package programming_elements.level2;
import java.util.*;

public class IncomeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        double salary;
        double bonus;
        // Declares variables to store salary and bonus

        System.out.print("Enter salary: ");
        // Prompts user to enter salary

        salary = input.nextDouble();
        // Reads salary from user

        System.out.print("Enter bonus: ");
        // Prompts user to enter bonus

        bonus = input.nextDouble();
        // Reads bonus from user

        double totalIncome = salary + bonus;
        // Calculates total income

        System.out.println("The salary is INR " + salary +
                " and bonus is INR " + bonus +
                ". Hence Total Income is INR " + totalIncome);
        // Displays salary, bonus, and total income
    }
}