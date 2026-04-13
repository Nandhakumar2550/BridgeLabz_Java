package control_flows.level3;

public class DayOfWeek {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        // Reads month from command-line arguments

        int d = Integer.parseInt(args[1]);
        // Reads day from command-line arguments

        int y = Integer.parseInt(args[2]);
        // Reads year from command-line arguments

        int y0 = y - (14 - m) / 12;
        // Adjusts year based on month (for Jan & Feb as months 13,14 of previous year)

        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        // Calculates leap year corrections

        int m0 = m + 12 * ((14 - m) / 12) - 2;
        // Adjusts month value for calculation

        int d0 = (d + x + (31 * m0) / 12) % 7;
        // Calculates day of week (0 = Sunday, 1 = Monday, ...)

        System.out.println("Day of week (0=Sunday, 1=Monday,...): " + d0);
        // Displays result
    }
}