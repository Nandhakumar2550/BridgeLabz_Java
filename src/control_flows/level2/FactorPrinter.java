package control_flows.level2;
import java.util.*;
public class FactorPrinter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=scan.nextInt();
        for(int i=1;i<num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
        scan.close();
    }
}
