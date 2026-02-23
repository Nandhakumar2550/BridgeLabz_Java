package control_flows.level2;
import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the height in cm");
        double height=scan.nextDouble();
        System.out.println("Enter the weight in kg");
        double weight=scan.nextDouble();
        double heightinmeter=height/100;
        double bmi=weight/(heightinmeter*heightinmeter);
        String result;
        if(bmi<18.5){
            result="Underweight";
        }else if(bmi<25){
            result="Normalweight";
        }else if(bmi<30){
            result="overweight";
        }else{
            result="obse";
        }
        System.out.println("BMI " + bmi);
        System.out.println("Status " + result);
        scan.close();
    }
}
