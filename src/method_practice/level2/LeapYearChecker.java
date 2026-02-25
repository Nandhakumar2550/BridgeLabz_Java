package method_practice.level2;
import java.util.*;
public class LeapYearChecker {
    public static boolean isleapYear(int year){
        if(year<1582){
            return false;
        }else if((year%4==0 && year%100!=0)||(year%400==0)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        if(isleapYear(year)){
            System.out.println("leap year");
        }else{
            System.out.println("Not an Leap year");
        }
    }
}
