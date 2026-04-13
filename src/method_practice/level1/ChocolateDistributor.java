package method_practice.level1;
import java.util.Scanner;

public class ChocolateDistributor {

    public static int[] findRemainderAndQuotient(int chocolates, int children){

        int a = chocolates / children;
        // Calculates chocolates per child (quotient)

        int b = chocolates % children;
        // Calculates remaining chocolates (remainder)

        return new int[]{a, b};
        // Returns both values as an array
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.print("Enter number of chocolates: ");
        // Prompts user to enter total chocolates

        int numberOfChocolates = input.nextInt();
        // Reads total chocolates

        System.out.print("Enter number of children: ");
        // Prompts user to enter number of children

        int numberOfChildren = input.nextInt();
        // Reads number of children

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        // Calls method to calculate quotient and remainder

        System.out.println("Each child gets " + result[0]);
        // Displays chocolates per child

        System.out.println("Remaining chocolates " + result[1]);
        // Displays remaining chocolates

        input.close();
        // Closes Scanner
    }
}