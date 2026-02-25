package method_practice.level1;
import java.util.Scanner;
public class ChocolateDistributor {
    public static int[] findRemainderAndQuotient(int chocolates,int children){
        int a=chocolates/children;
        int b=chocolates%children;

        return new int[]{a,b};
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Each child gets " + result[0]);
        System.out.println("Remaining chocolates " + result[1]);
    }
}
