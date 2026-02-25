package method_practice.level1;
import java.util.*;
public class MinMaxFinder {
    public static int[] findSmallestAndLargest(int num1,int num2,int num3){
        int largest=num1;
        int smallest=num1;
        if(num2>largest) largest=num2;
        if(num3>largest) largest=num3;

        if(num2<smallest) smallest=num2;
        if(num3<smallest) smallest=num3;

        return new int[]{largest,smallest};
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1=scan.nextInt();
        System.out.println("Enter the num2");
        int num2=scan.nextInt();
        System.out.println("Enter the num3");
        int num3=scan.nextInt();

        int[] result=findSmallestAndLargest(num1, num2, num3);
        System.out.println("largest " + result[0]);
        System.out.println("smallest " + result[1]);
        scan.close();
    }
}
