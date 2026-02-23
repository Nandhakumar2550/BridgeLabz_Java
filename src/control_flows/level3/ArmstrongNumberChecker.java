package control_flows.level3;
import java.sql.SQLOutput;
import java.util.*;
public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        int temp=num;
        int sum=0;
        while(temp>0){
            int rem=temp%10;
            sum=sum+(rem*rem*rem);
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("The Given Number is an Armstrong");
        }else{
            System.out.println("The given number is not an Armstrong");
        }
        scan.close();
    }
}
