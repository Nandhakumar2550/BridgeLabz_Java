package control_flows.level1;
import java.util.*;
public class Largestnumber {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number1 ");
        int num1 = scan.nextInt();
        System.out.println("Enter the number2");
        int num2 =scan.nextInt();
        System.out.println("Enter the number3");
        int num3=scan.nextInt();

        boolean num1islargest=(num1>num2 && num1>num3);
        boolean num2islargest=(num2>num1 && num2>num3);
        boolean num3islargest=(num3>num2 && num3>num1);

        System.out.println(" Is the first number the largest? " + num1islargest);
        System.out.println("Is the second number the largest? " + num2islargest);
        System.out.println("Is the third number the largest? " + num3islargest);
    }
}
