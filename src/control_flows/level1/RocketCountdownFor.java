package control_flows.level1;
import java.util.*;

public class RocketCountdownFor {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number");
        // Prompts user to enter starting countdown number

        int count = scan.nextInt();
        // Reads countdown starting value

        for(int i = count; i > 0; i--){
            // Loop starts from count and decrements until 1

            System.out.println(i);
            // Prints current countdown value
        }

        System.out.println("Rocket launched");
        // Prints message after countdown ends

        scan.close();
        // Closes Scanner
    }
}