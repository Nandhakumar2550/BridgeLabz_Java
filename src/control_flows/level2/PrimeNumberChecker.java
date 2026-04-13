package control_flows.level2;
import java.util.*;

public class PrimeNumberChecker {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number");
        // Prompts user to enter a number

        int num = scan.nextInt();
        // Reads the number

        boolean isprime = true;
        // Assumes number is prime initially

        if(num <= 1){
            // Checks if number is less than or equal to 1

            isprime = false;
            // Numbers <= 1 are not prime

        } else {
            for(int i = 2; i * i < num; i++){
                // Loops from 2 to √num (optimization)

                if(num % i == 0){
                    // Checks if divisible by i

                    isprime = false;
                    // Not a prime number

                    break;
                    // Exit loop early
                }
            }
        }

        if(isprime){
            // If number is prime

            System.out.println("The given number is prime number");

        } else {
            // If number is not prime

            System.out.println("It is not an prime number");
        }

        scan.close();
        // Closes Scanner
    }
}