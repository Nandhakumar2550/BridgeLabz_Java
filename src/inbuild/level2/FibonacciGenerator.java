package inbuild.level2;
import java.util.Scanner;
public class FibonacciGenerator {
    public static void generate(int terms) {

        int a = 0, b = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();

        generate(terms);
    }
}
