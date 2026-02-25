package method_practice.level2;
import java.util.*;
public class StudentVoteChecker {
    public static boolean vote(int age) {
        if (age >= 18) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=1;i<=10;i++) {
            System.out.println("Enter the age " + i + ":");
            arr[i] = scan.nextInt();
            boolean result=vote(arr[i]);
            if(result){
                System.out.println("can vote");
            }else{
                System.out.println("Not able vote");
            }
        }
        scan.close();
    }
}
