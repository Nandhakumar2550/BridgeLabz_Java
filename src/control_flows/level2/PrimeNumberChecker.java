package control_flows.level2;
import java.util.*;
public class PrimeNumberChecker {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        boolean isprime=true;
        if(num<=1){
            isprime=false;
        }else{
            for(int i=2;i*i<num;i++){
                if(num%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime){
            System.out.println("The given number is prime number");
        }else{
            System.out.println("It is not an prime number");
        }
        scan.close();
    }
}
