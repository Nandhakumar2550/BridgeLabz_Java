package control_flows.level2;
import java.util.*;
public class GreatestFactorFinder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        int greatestfactor=1;
        for(int i=num-1;i>=1;i--){

            if(num%i==0){
                greatestfactor=i;
                break;
            }
        }
        System.out.println(greatestfactor);
        scan.close();
    }
}
