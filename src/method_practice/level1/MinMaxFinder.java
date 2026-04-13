package method_practice.level1;
import java.util.*;

public class MinMaxFinder {

    public static int[] findSmallestAndLargest(int num1, int num2, int num3){

        int largest = num1;
        // Assumes first number is largest initially

        int smallest = num1;
        // Assumes first number is smallest initially

        if(num2 > largest) largest = num2;
        // Updates largest if num2 is greater

        if(num3 > largest) largest = num3;
        // Updates largest if num3 is greater

        if(num2 < smallest) smallest = num2;
        // Updates smallest if num2 is smaller

        if(num3 < smallest) smallest = num3;
        // Updates smallest if num3 is smaller

        return new int[]{largest, smallest};
        // Returns largest and smallest as array
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the num1");
        // Prompts user for first number

        int num1 = scan.nextInt();
        // Reads first number

        System.out.println("Enter the num2");
        // Prompts user for second number

        int num2 = scan.nextInt();
        // Reads second number

        System.out.println("Enter the num3");
        // Prompts user for third number

        int num3 = scan.nextInt();
        // Reads third number

        int[] result = findSmallestAndLargest(num1, num2, num3);
        // Calls method to find min and max

        System.out.println("largest " + result[0]);
        // Displays largest value

        System.out.println("smallest " + result[1]);
        // Displays smallest value

        scan.close();
        // Closes Scanner
    }
}