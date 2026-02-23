package control_flows.level2;
import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the physics marks");
        double physics=scan.nextInt();
        System.out.println("Enter the chemistry marks");
        double chemistry=scan.nextInt();
        System.out.println("Enter the Maths marks");
        double maths=scan.nextInt();
        double percentage=(physics + chemistry + maths)/3;
        String grade;
        String remarks;
        if(percentage>=90){
            grade="A";
            remarks="Excellent";
        }else if(percentage>=75){
            grade="B";
            remarks="Very Good";
        }else if(percentage>=60){
            grade="C";
            remarks="Good";
        }else if(percentage>=50){
            grade="D";
            remarks="Pass";
        }else{
            grade="F";
            remarks="Fail";
        }
        System.out.println(percentage);
        System.out.println(grade);
        System.out.println(remarks);
        scan.close();
    }
}
