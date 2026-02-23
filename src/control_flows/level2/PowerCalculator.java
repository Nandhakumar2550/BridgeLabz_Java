package control_flows.level2;
import java.util.*;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=scan.nextInt();
        System.out.println("Enter the power");
        int power=scan.nextInt();
        int result=1;
        for(int i=1;i<=power;i++){
            result=result*num;
        }
        System.out.println(result);

    }
}
