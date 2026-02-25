package method_practice.level1;
import java.util.*;
public class NumberTypeChecker {
    public static int checker(int num){
        if(num>0){
            return 1;
        }else if(num<0){
            return -1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        int result=checker(num);
        System.out.println(result);
    }
}
