package inbuild.level1;
import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static LocalDate calculate(LocalDate date) {

        LocalDate updated = date
                .plusDays(7)
                // Adds 7 days to the given date

                .plusMonths(1)
                // Adds 1 month

                .plusYears(2)
                // Adds 2 years

                .minusWeeks(3);
        // Subtracts 3 weeks

        return updated;
        // Returns the updated date
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.print("Enter date (yyyy-MM-dd): ");
        // Prompts user to enter date in specific format

        String userInput = input.nextLine();
        // Reads input as string

        LocalDate date = LocalDate.parse(userInput);
        // Converts string to LocalDate object

        LocalDate result = calculate(date);
        // Calls method to perform date arithmetic

        System.out.println("Updated Date: " + result);
        // Displays the updated date

        input.close();
        // Closes Scanner
    }
}