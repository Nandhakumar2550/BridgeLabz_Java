package inbuild.level1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        // Gets the current system date

        DateTimeFormatter format1 =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Defines format: day/month/year

        DateTimeFormatter format2 =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Defines format: year-month-day (ISO format)

        DateTimeFormatter format3 =
                DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        // Defines format: short day, short month, day, year

        System.out.println("Format 1: " + today.format(format1));
        // Prints date in format1

        System.out.println("Format 2: " + today.format(format2));
        // Prints date in format2

        System.out.println("Format 3: " + today.format(format3));
        // Prints date in format3
    }
}