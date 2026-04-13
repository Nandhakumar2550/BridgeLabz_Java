package inbuild.level1;
import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void compare(LocalDate d1, LocalDate d2) {

        if (d1.isBefore(d2))
            // Checks if first date is before second date
            System.out.println("First date is BEFORE second date.");

        else if (d1.isAfter(d2))
            // Checks if first date is after second date
            System.out.println("First date is AFTER second date.");

        else if (d1.isEqual(d2))
            // Checks if both dates are equal
            System.out.println("Both dates are SAME.");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.print("Enter first date (yyyy-MM-dd): ");
        // Prompts user to enter first date

        LocalDate date1 = LocalDate.parse(input.nextLine());
        // Reads and converts first date

        System.out.print("Enter second date (yyyy-MM-dd): ");
        // Prompts user to enter second date

        LocalDate date2 = LocalDate.parse(input.nextLine());
        // Reads and converts second date

        compare(date1, date2);
        // Calls method to compare dates

        input.close();
        // Closes Scanner
    }
}