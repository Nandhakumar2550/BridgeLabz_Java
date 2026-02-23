package control_flows.level1;
import java.sql.SQLOutput;
import java.util.*;
public class EmployeeBonusCalculator {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary=scan.nextInt();
        System.out.println("Enter the year of experience");
        int year=scan.nextInt();
        double bonuspercentage=5.0;
        double bonusamount=0.0;
        if(year>5){
            bonusamount=(bonuspercentage/100)*salary;
        }
        System.out.println(bonusamount);
        scan.close();
    }
}
