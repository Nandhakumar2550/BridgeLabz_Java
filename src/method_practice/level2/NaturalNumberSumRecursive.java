package method_practice.level2;
import java.util.*;

public class NaturalNumberSumRecursive {

    public static int sumRecursive(int n){

        if(n == 1){
            // Base case: sum of first natural number

            return 1;
        }

        return n + sumRecursive(n - 1);
        // Recursive call: n + sum of (n-1)
    }

    public static int sumFormula(int n){

        return n * (n + 1) / 2;
        // Uses formula for sum of first n natural numbers
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        System.out.print("Enter a natural number: ");
        // Prompts user

        int n = input.nextInt();
        // Reads input

        if (n <= 0) {
            // Checks if number is not natural

            System.out.println("Not a natural number");
            return;
            // Exits program
        }

        int recursiveSum = sumRecursive(n);
        // Calculates sum using recursion

        int formulaSum = sumFormula(n);
        // Calculates sum using formula

        System.out.println("Recursive Sum = " + recursiveSum);
        // Displays recursive result

        System.out.println("Formula Sum = " + formulaSum);
        // Displays formula result

        System.out.println("Both are equal? " + (recursiveSum == formulaSum));
        // Compares both results

        input.close();
        // Closes Scanner
    }
}