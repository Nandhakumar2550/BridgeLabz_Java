package method_practice.level2;
import java.util.*;

public class NumberAnalyzerMethod {

    public static boolean ispositive(int n){
        return n > 0;
        // Checks if number is positive
    }

    public static boolean iseven(int n){
        return n % 2 == 0;
        // Checks if number is even
    }

    public static int greater(int num1, int num2){

        if(num1 > num2){
            return 1;
            // Returns 1 if first number is greater

        } else if(num1 < num2){
            return -1;
            // Returns -1 if second number is greater

        } else {
            return 0;
            // Returns 0 if both are equal
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object

        int[] nums = new int[5];
        // Array to store 5 numbers

        for(int i = 0; i < 5; i++){

            System.out.println("Enter the number " + i + " ");
            // Prompts user for input

            nums[i] = scan.nextInt();
            // Reads number

            if(ispositive(nums[i])){
                // Checks if number is positive

                if(iseven(nums[i])){
                    // Checks if even

                    System.out.println("Given number is even");

                } else {
                    System.out.println("Given number is odd");
                    // Number is odd
                }

            } else {
                System.out.println("given number is not positive");
                // Handles negative or zero
            }
        }

        int result = greater(nums[0], nums[4]);
        // Compares first and last element

        if(result == 1){
            System.out.println("First is greater");

        } else if(result == -1){
            System.out.println("last is greater");

        } else {
            System.out.println("Both are equal");
        }

        scan.close();
        // Closes Scanner
    }
}