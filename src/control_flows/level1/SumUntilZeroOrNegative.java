package control_flows.level1;
import java.util.*;
public class SumUntilZeroOrNegative {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        double num;
        double sum=0;
        while(true){
            System.out.println("Enter the number");
            num=scan.nextDouble();
            if(num<=0){
                break;
            }
            sum = sum+num;
        }
        System.out.println(sum);
        scan.close();
    }
}
