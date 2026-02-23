package control_flows.level1;
import java.util.*;
public class SumUntilZero {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num ");
        double num=scan.nextDouble();
        double sum=0;
        while(num!=0){
            sum=sum+num;
            System.out.println("Enter the number");
            num=scan.nextDouble();
        }
        System.out.println(sum);
        scan.close();
    }
}
