package control_flows.level2;
import java.util.*;
public class LeapYearSingleCondition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=scan.nextInt();
        boolean isleap=(year>=1582)&&((year%4==0 && year%100!=0)||(year%400==0));
        if(isleap){
            System.out.println("Its is an leap year");
        }else{
            System.out.println("Its is not an leap year");
        }
        scan.close();
    }
}
