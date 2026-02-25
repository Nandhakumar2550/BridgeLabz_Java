package method_practice.level2;
import java.util.*;
public class FactorAnalyzer {
    public static int[] findFactors(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        int[] arr=new int[count];
        int j=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                arr[j]=i;
                j++;
            }
        }
        return arr;
    }
    public static int findSum(int[] arr){
        int sum=0;
        for(int n:arr){
            sum+=n;
        }
        return sum;
    }
    public static int findProduct(int[] arr){
        int product=1;
        for(int v:arr){
            product *=v;
        }
        return product;
    }
    public static long findSumOfSquares(int[] arr){
        int result=0;
        for(int r:arr){
            result +=Math.pow(r,2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] factors = findFactors(number);
        System.out.println("Factors:");
        for (int f : factors) {
            System.out.println(f);
        }
        System.out.println("Sum = " + findSum(factors));
        System.out.println("Product = " + findProduct(factors));
        System.out.println("Sum of Squares = " + findSumOfSquares(factors));
    }
}
