package inbuild.level2;
import java.util.Scanner;

public class MaxOfThree {

    public static int getInput(Scanner input, String message) {
        System.out.print(message);
        // Displays input prompt

        return input.nextInt();
        // Reads and returns integer input
    }

    public static int findMax(int a, int b, int c) {

        int max = a;
        // Assumes first number is maximum initially

        if (b > max) max = b;
        // Updates max if second number is greater

        if (c > max) max = c;
        // Updates max if third number is greater

        return max;
        // Returns the maximum value
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        int num1 = getInput(input, "Enter first number: ");
        // Gets first number

        int num2 = getInput(input, "Enter second number: ");
        // Gets second number

        int num3 = getInput(input, "Enter third number: ");
        // Gets third number

        System.out.println("Maximum: " + findMax(num1, num2, num3));
        // Calls method and displays maximum value

        input.close();
        // Closes Scanner
    }
}