package inbuild.level1;
import java.time.LocalDate;
import java.util.Scanner;
public class DateComparison {
    public static void compare(LocalDate d1, LocalDate d2) {

        if (d1.isBefore(d2))
            System.out.println("First date is BEFORE second date.");
        else if (d1.isAfter(d2))
            System.out.println("First date is AFTER second date.");
        else if (d1.isEqual(d2))
            System.out.println("Both dates are SAME.");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(input.nextLine());

        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(input.nextLine());

        compare(date1, date2);
    }
}
