package control_flows.level2;
import java.util.*;

public class FriendComparison {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the age of Amar");
        // Prompts for Amar's age

        int ageAmar = scan.nextInt();
        // Reads Amar's age

        System.out.println("Enter the age of Akbar");
        // Prompts for Akbar's age

        int ageAkbar = scan.nextInt();
        // Reads Akbar's age

        System.out.println("Enter the age of Anthony");
        // Prompts for Anthony's age

        int ageAnthony = scan.nextInt();
        // Reads Anthony's age

        System.out.println("Enter the height of Amar");
        // Prompts for Amar's height

        double heightAmar = scan.nextDouble();
        // Reads Amar's height

        System.out.println("Enter the height of Akbar");
        // Prompts for Akbar's height

        double heightAkbar = scan.nextDouble();
        // Reads Akbar's height

        System.out.println("Enter the height Anthony");
        // Prompts for Anthony's height

        double heightAnthony = scan.nextDouble();
        // Reads Anthony's height

        if(ageAmar < ageAkbar && ageAmar < ageAnthony){
            // Checks if Amar is youngest

            System.out.println("Amar is the youngest");

        } else if(ageAkbar < ageAmar && ageAkbar < ageAnthony){
            // Checks if Akbar is youngest

            System.out.println("Akbar is the youngest");

        } else {
            // Otherwise Anthony is youngest

            System.out.println("Anthony is the youngest");
        }

        if(heightAmar > heightAkbar && heightAmar > heightAnthony){
            // Checks if Amar is tallest

            System.out.println("Amar is the Tallest");

        } else if(heightAkbar > heightAmar && heightAkbar > heightAnthony){
            // Checks if Akbar is tallest

            System.out.println("Akbar is the Tallest");

        } else {
            // Otherwise Anthony is tallest

            System.out.println("Anthony is the Tallest");
        }

        scan.close();
        // Closes Scanner
    }
}