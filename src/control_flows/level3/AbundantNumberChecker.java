package control_flows.level3;
import java.sql.SQLOutput;
import java.util.*;
public class AbundantNumberChecker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum>num){
            System.out.println("The number is an Abundant");
        }else{
            System.out.println("The number is not Abundant");
        }
        scan.close();
    }
}
