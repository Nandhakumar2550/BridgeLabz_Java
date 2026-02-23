package control_flows.level1;
import java.util.*;
public class MultiplicationTablePrinter {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        for(int i=6;i<=9;i++){
            int result=num*i;
            System.out.println(result);
        }
        scan.close();
    }
}
