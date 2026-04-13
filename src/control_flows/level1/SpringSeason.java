package control_flows.level1;
import java.util.*;

public class SpringSeason {
    public static void main(String args[]){

        int month = Integer.parseInt(args[0]);
        // Reads month from command-line arguments

        int day = Integer.parseInt(args[1]);
        // Reads day from command-line arguments

        boolean isspring = (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 6) ||
                (month == 6 && day <= 20);
        // Checks if date falls in spring season (March 20 to June 20)

        if(isspring){
            // If condition is true

            System.out.println("its spring season");
            // Prints spring season message

        } else {
            // If condition is false

            System.out.println("its not spring season");
            // Prints non-spring message
        }
    }
}