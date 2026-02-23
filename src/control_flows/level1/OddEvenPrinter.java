package control_flows.level1;
import java.util.*;
public class OddEvenPrinter {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        if(num>0){
            for(int i=1;i<=num;i++){
                if(i%2==0){
                    System.out.println("Number is even");
                }else{
                    System.out.println("Number is odd");
                }
            }
        }else{
            System.out.println("Entered Number is not an Natural number");
        }
        scan.close();
    }
}
