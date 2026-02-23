package control_flows.level1;
import java.util.*;
public class NumberTypeChecker {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println("The number is positive ");
        } else if (num < 0) {
            System.out.println("The number is negative ");
        } else {
            System.out.println("The number is Zero");
        }
        scan.close();
    }
}
