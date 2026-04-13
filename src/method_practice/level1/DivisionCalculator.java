package method_practice.level1;
import java.util.Scanner;

public class DivisionCalculator {

    public static int[] findRemainderAndQuotient(int num, int divi){

        int a = num / divi;
        // Calculates quotient

        int b = num % divi;
        // Calculates remainder

        return new int[]{a, b};
        // Returns quotient and remainder as array
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.print("Enter number: ");
        // Prompts user to enter number

        int number = input.nextInt();
        // Reads number

        System.out.print("Enter divisor: ");
        // Prompts user to enter divisor

        int divisor = input.nextInt();
        // Reads divisor

        int[] result = findRemainderAndQuotient(number, divisor);
        // Calls method to compute quotient and remainder

        System.out.println("Quotient = " + result[0]);
        // Displays quotient

        System.out.println("Remainder = " + result[1]);
        // Displays remainder

        input.close();
        // Closes Scanner
    }
}