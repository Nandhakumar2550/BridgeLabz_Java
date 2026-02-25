package method_practice.level1;
import java.util.Scanner;
public class DivisionCalculator {
    public static int[] findRemainderAndQuotient(int num,int divi){
        int a=num/divi;
        int b=num%divi;

        return new int[]{a,b};
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient = " + result[0]);
        System.out.println("Remainder = " + result[1]);
    }
}
