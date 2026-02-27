package inbuild.level2;
import java.util.Scanner;

public class MaxOfThree {
    public static int getInput(Scanner input, String message) {
        System.out.print(message);
        return input.nextInt();
    }

    public static int findMax(int a, int b, int c) {

        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = getInput(input, "Enter first number: ");
        int num2 = getInput(input, "Enter second number: ");
        int num3 = getInput(input, "Enter third number: ");

        System.out.println("Maximum: " + findMax(num1, num2, num3));
    }
}
