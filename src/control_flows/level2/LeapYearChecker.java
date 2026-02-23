package control_flows.level2;
import java.util.*;
public class LeapYearChecker {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the year ");
        int year=scan.nextInt();
        if(year<1582){
            System.out.println("Leap year calculation is valid only for year >= 1582");
        }else{
            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        System.out.println("It is an Leap year");
                    }else{
                        System.out.println("Year is not a Leap Year");
                    }
                }else{
                    System.out.println("Year is  a Leap Year");
                }
            }else{
                System.out.println("Year is not a Leap Year");
            }
        }
        scan.close();
    }
}
