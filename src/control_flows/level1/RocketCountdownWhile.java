package control_flows.level1;
import java.util.*;
public class RocketCountdownWhile {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int count=scan.nextInt();
        while(count>0){
            System.out.println(count);
            count--;
        }
        System.out.println("Rocked Lanched");
        scan.close();
    }
}
