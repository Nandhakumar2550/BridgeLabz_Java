package control_flows.level1;
import java.util.*;
public class FactorialFor {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=scan.nextInt();
        if(num>0){
            int sum=1;
            for(int i=1;i<=num;i++){
                sum=sum*i;
            }
            System.out.println("The factorial of " + num + " is " + sum);
        }else{
            System.out.println("Enter the positive number");
        }
        scan.close();
    }
}
