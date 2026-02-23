package control_flows.level3;
import java.util.*;
public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        int temp=num;
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            sum=sum+digit;
            temp=temp/10;
        }
        if(num%sum==0){
            System.out.println("Number is Harshad");
        }else{
            System.out.println("Number is Harshad");
        }
        scan.close();
    }
}
