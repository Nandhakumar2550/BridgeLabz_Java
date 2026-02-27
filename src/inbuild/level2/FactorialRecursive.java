package inbuild.level2;
import java.util.Scanner;
public class FactorialRecursive {
    public static long factorial(int n) {

        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        System.out.println("Factorial: " + factorial(number));
    }
}
