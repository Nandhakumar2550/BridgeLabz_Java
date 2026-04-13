package inbuild.level2;
import java.util.Scanner;

public class GCDLCMCalculator {

    public static int gcd(int a, int b) {

        while (b != 0) {
            // Loop runs until remainder becomes 0

            int temp = b;
            // Stores current value of b

            b = a % b;
            // Updates b with remainder of a ÷ b

            a = temp;
            // Updates a with previous b value
        }

        return a;
        // Returns GCD
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
        // Calculates LCM using formula (a × b) / GCD
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.print("Enter first number: ");
        // Prompts user to enter first number

        int num1 = input.nextInt();
        // Reads first number

        System.out.print("Enter second number: ");
        // Prompts user to enter second number

        int num2 = input.nextInt();
        // Reads second number

        System.out.println("GCD: " + gcd(num1, num2));
        // Displays GCD

        System.out.println("LCM: " + lcm(num1, num2));
        // Displays LCM

        input.close();
        // Closes Scanner
    }
}