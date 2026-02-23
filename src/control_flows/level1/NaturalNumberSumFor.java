package control_flows.level1;
import java.util.*;
public class NaturalNumberSumFor {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        if(num>0){
            int sum=0;
            for(int i=1;i<=num;i++){
                sum=sum+i;
            }
            int sumvalue=num *(num+1)/2;
            System.out.println("Sum using while loop is " + sum);
            System.out.println("Sum using formula is " + sumvalue);
            System.out.println("Both computations are equal? " + (sumvalue==sum));
        }else{
            System.out.println("The number " + num + " is not a natural number");
        }
        scan.close();
    }
}
