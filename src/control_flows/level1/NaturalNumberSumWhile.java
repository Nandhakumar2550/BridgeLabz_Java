package control_flows.level1;
import java.util.*;
public class NaturalNumberSumWhile {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        if(num>0){
            int count=1;
            int sum=0;
            while(count<=num){
                sum +=count;
                count++;
            }
            int sumvalue=num *(num+1)/2;
            System.out.println("Sum using while loop is " + sum );
            System.out.println("Sum using formula is " + sumvalue);
            System.out.println("Both computations are equal? " + (sumvalue==sum));
        }else{
            System.out.println("The number " + num + " is not a natural number");
        }
    }
}
