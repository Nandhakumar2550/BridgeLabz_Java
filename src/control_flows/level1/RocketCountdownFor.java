package control_flows.level1;
import java.util.*;
public class RocketCountdownFor {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int count=scan.nextInt();
        for(int i=count;i>0;i--){
            System.out.println(i);
        }
        System.out.println("Rocket launched");
        scan.close();

    }
}
