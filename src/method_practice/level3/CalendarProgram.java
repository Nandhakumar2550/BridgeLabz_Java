package method_practice.level3;
import java.util.Scanner;

public class CalendarProgram {

    static String[] months = {
            "", "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
    };
    // Stores month names (index 1–12)

    static int[] days = {
            0, 31, 28, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31
    };
    // Stores number of days in each month

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
        // Checks if given year is leap year
    }

    public static int firstDay(int month, int year) {

        int y0 = year - (14 - month) / 12;
        // Adjusts year for Jan & Feb

        int x = y0 + y0/4 - y0/100 + y0/400;
        // Leap year corrections

        int m0 = month + 12 * ((14 - month) / 12) - 2;
        // Adjusts month value

        return (1 + x + (31 * m0) / 12) % 7;
        // Returns first day of month (0=Sunday)
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        System.out.print("Enter month (1-12): ");
        // Prompts user

        int month = input.nextInt();
        // Reads month

        System.out.print("Enter year: ");
        // Prompts user

        int year = input.nextInt();
        // Reads year

        if (month == 2 && isLeap(year))
            days[2] = 29;
        // Adjusts February for leap year

        int firstDay = firstDay(month, year);
        // Gets first day of the month

        System.out.println("\n   " + months[month] + " " + year);
        // Prints month header

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        // Prints days header

        for (int i = 0; i < firstDay; i++)
            System.out.print("    ");
        // Adds spacing before first day

        for (int d = 1; d <= days[month]; d++) {

            System.out.printf("%3d ", d);
            // Prints each date

            if ((d + firstDay) % 7 == 0)
                System.out.println();
            // Moves to next line after Saturday
        }

        input.close();
        // Closes Scanner
    }
}