package method_practice.level2;
import java.util.*;

public class FactorAnalyzer {

    public static int[] findFactors(int num){

        int count = 0;
        // Counts number of factors

        for(int i = 1; i <= num; i++){
            // Loops from 1 to num

            if(num % i == 0){
                // Checks if i is a factor

                count++;
                // Increments factor count
            }
        }

        int[] arr = new int[count];
        // Creates array to store factors

        int j = 0;
        // Index for factor array

        for(int i = 1; i <= num; i++){
            // Loops again to store factors

            if(num % i == 0){
                arr[j] = i;
                // Stores factor

                j++;
                // Moves to next index
            }
        }

        return arr;
        // Returns array of factors
    }

    public static int findSum(int[] arr){

        int sum = 0;
        // Initializes sum

        for(int n : arr){
            sum += n;
            // Adds each factor
        }

        return sum;
        // Returns sum
    }

    public static int findProduct(int[] arr){

        int product = 1;
        // Initializes product

        for(int v : arr){
            product *= v;
            // Multiplies each factor
        }

        return product;
        // Returns product
    }

    public static long findSumOfSquares(int[] arr){

        int result = 0;
        // Initializes result

        for(int r : arr){
            result += Math.pow(r, 2);
            // Adds square of each factor
        }

        return result;
        // Returns sum of squares
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object

        System.out.print("Enter a number: ");
        // Prompts user

        int number = input.nextInt();
        // Reads number

        int[] factors = findFactors(number);
        // Finds factors

        System.out.println("Factors:");
        // Prints heading

        for (int f : factors) {
            System.out.println(f);
            // Prints each factor
        }

        System.out.println("Sum = " + findSum(factors));
        // Prints sum of factors

        System.out.println("Product = " + findProduct(factors));
        // Prints product of factors

        System.out.println("Sum of Squares = " + findSumOfSquares(factors));
        // Prints sum of squares

        input.close();
        // Closes Scanner
    }
}