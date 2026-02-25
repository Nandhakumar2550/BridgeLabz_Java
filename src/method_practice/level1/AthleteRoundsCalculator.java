package method_practice.level1;
import java.util.*;
public class AthleteRoundsCalculator {
    public static double calculate(double side1,double side2,double side3){
        double perimeter=side1+side2+side3;
        int totaldistance=5000;
         double result=totaldistance/perimeter;
         return result;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the side1");
        double side1=scan.nextDouble();
        System.out.println("Enter the side2");
        double side2=scan.nextDouble();
        System.out.println("Enter the side3");
        double side3=scan.nextDouble();
        double result=calculate( side1, side2, side3);
        System.out.println("Number of rounds needed = " + result);
    }
}
