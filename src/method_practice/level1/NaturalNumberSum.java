package method_practice.level1;
import java.util.*;
public class NaturalNumberSum {
    public static int calculateSum(int num){
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scan.nextInt();

        int sum = calculateSum(number);

        System.out.println("Sum of " + number + " natural numbers is " + sum);
         scan.close();
    }
}
