package inbuild.level2;
import java.util.Scanner;

public class PrimeChecker {

    public static boolean isPrime(int number) {

        if (number <= 1)
            // Numbers less than or equal to 1 are not prime
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++)
            // Loop from 2 to square root of number (optimization)

            if (number % i == 0)
                // Checks if number is divisible by i

                return false;
        // If divisible, not a prime number

        return true;
        // If no divisors found, it is prime
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.print("Enter number: ");
        // Prompts user to enter number

        int number = input.nextInt();
        // Reads number

        if (isPrime(number))
            // Calls method to check prime

            System.out.println("Prime Number");
            // Prints prime result

        else
            System.out.println("Not Prime");
        // Prints not prime result

        input.close();
        // Closes Scanner
    }
}