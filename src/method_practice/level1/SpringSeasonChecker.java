package method_practice.level1;

public class SpringSeasonChecker {

    public static boolean isspring(int month, int day){

        boolean result = (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);
        // Checks if date falls between March 20 and June 20

        return result;
        // Returns true if spring, otherwise false
    }

    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);
        // Reads month from command-line arguments

        int day = Integer.parseInt(args[1]);
        // Reads day from command-line arguments

        if(isspring(month, day)){
            // Checks if given date is in spring season

            System.out.println("Its a Spring Season");
            // Prints spring message

        } else {
            System.out.println("Not a Spring Season");
            // Prints non-spring message
        }
    }
}