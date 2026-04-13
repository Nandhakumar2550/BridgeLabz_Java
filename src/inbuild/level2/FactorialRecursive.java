package inbuild.level2;
import java.util.Scanner;

public class FactorialRecursive {

    public static long factorial(int n) {

        if (n == 0 || n == 1)
            // Base case: factorial of 0 or 1 is 1
            return 1;

        return n * factorial(n - 1);
        // Recursive call: n × factorial(n-1)
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.print("Enter number: ");
        // Prompts user to enter a number

        int number = input.nextInt();
        // Reads the number

        System.out.println("Factorial: " + factorial(number));
        // Calls recursive method and prints result

        input.close();
        // Closes Scanner
    }
}