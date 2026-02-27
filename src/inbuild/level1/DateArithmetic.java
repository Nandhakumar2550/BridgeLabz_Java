package inbuild.level1;
import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static LocalDate calculate(LocalDate date) {

        LocalDate updated = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        return updated;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter date (yyyy-MM-dd): ");
        String userInput = input.nextLine();

        LocalDate date = LocalDate.parse(userInput);

        LocalDate result = calculate(date);

        System.out.println("Updated Date: " + result);
    }
}
