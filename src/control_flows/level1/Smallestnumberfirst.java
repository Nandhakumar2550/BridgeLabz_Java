package control_flows.level1;
import java.util.*;
public class Smallestnumberfirst {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number1 ");
        int num1=scan.nextInt();
        System.out.println("Enter the number2 ");
        int num2=scan.nextInt();
        System.out.println("Enter the number3");
        int num3=scan.nextInt();
        boolean issmallest=(num1<num2 && num1<num3);
        System.out.println(" Is the first number the smallest? " + issmallest );
    }
}
