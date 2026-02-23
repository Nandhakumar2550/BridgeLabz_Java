package control_flows.level2;
import java.sql.SQLOutput;
import java.util.*;
public class MultiplesBelowHundred {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enyter the number");
        int num=scan.nextInt();
        for(int i=100;i>=1;i--){
            if(i%num==0){
                System.out.println(i);
            }
        }
        scan.close();
    }
}
