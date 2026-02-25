package method_practice.level1;
import java.util.*;
public class SimpleInterestCalculator {
    public static double calculateSimpleInterest(double principalamount,double rate,double time){
        double si=(principalamount * rate * time)/100;
        return si;
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Principal: ");
        double principalamount=scan.nextDouble();
        System.out.println("Enter Rate of Interest: ");
        double rate=scan.nextDouble();
        System.out.println("Enter Time: ");
        double time=scan.nextDouble();

        double result=calculateSimpleInterest(principalamount,rate,time);
        System.out.println("The Simple Interest is " + result +
                " for Principal " + principalamount +
                ", Rate of Interest " + rate +
                " and Time " + time);

    }
}
