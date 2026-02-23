package control_flows.level3;
import java.util.*;
public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1=scan.nextInt();
        System.out.println("Enter the number2");
        int num2=scan.nextInt();
        System.out.println("Enter the operator");
        String op=scan.next();
        double result;
        switch(op){
            case "+":
                result=num1+num2;
                System.out.println("Result " + result);
                break;
            case "-":
                result=num1-num2;
                System.out.println("Result " + result);
                break;
            case "*":
                result=num1*num2;
                System.out.println("Result " + result);
                break;
            case  "/":
                result=num1/num2;
                System.out.println("Result " + result);
                break;
            default:
                System.out.println("Invalid input");
        }
        scan.close();
    }
}
