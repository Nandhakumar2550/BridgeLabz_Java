package method_practice.level2;
import java.util.*;
public class NaturalNumberSumRecursive {
    public static int sumRecursive(int n){
        if(n==1){
            return 1;
        }
        return n+sumRecursive(n-1);
    }
    public static int sumFormula(int n){
        return n*(n+1)/2;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);
        System.out.println("Recursive Sum = " + recursiveSum);
        System.out.println("Formula Sum = " + formulaSum);
        System.out.println("Both are equal? " + (recursiveSum == formulaSum));
    }
}
