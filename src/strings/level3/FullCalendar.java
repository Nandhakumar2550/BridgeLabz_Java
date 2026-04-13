package strings.level3;

import java.util.Scanner;

public class FullCalendar {

    // Array of month names (index 1–12 used, index 0 is empty)
    static String[] months = {
            "", "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
    };

    // Number of days in each month (index 1–12 used)
    static int[] days = {
            0, 31, 28, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31
    };

    public static boolean isLeap(int year) {

        // Leap year condition:
        // Divisible by 4 and not by 100 OR divisible by 400
        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
    }

    public static int getFirstDay(int month, int year) {

        // Adjust year based on month for Zeller’s algorithm
        int y0 = year - (14 - month) / 12;

        // Helper calculation for weekday formula
        int x = y0 + y0/4 - y0/100 + y0/400;

        // Adjust month for algorithm
        int m0 = month + 12 * ((14 - month) / 12) - 2;

        // Return day of week (0 = Sunday, 6 = Saturday)
        return (1 + x + (31 * m0) / 12) % 7;
    }

    public static void displayCalendar(int month, int year) {

        // Adjust February days for leap year
        if (month == 2 && isLeap(year))
            days[2] = 29;

        // Get first day of the month
        int firstDay = getFirstDay(month, year);

        // Print calendar header
        System.out.println("\n     " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print initial spaces for first week alignment
        for (int i = 0; i < firstDay; i++)
            System.out.print("    ");

        // Print all days of the month
        for (int d = 1; d <= days[month]; d++) {

            // Print day with formatting
            System.out.printf("%3d ", d);

            // Move to next line after Saturday
            if ((d + firstDay) % 7 == 0)
                System.out.println();
        }
    }

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Input month
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        // Input year
        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Display calendar
        displayCalendar(month, year);
    }
}