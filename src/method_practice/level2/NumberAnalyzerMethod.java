package method_practice.level2;
import java.util.*;
public class NumberAnalyzerMethod {
    public static boolean ispositive(int n){
        return n>0;
    }
    public static boolean iseven(int n){
        return n%2==0;
    }
    public static int greater(int num1,int num2){
        if(num1>num2){
            return 1;
        }else if(num1<num2){
            return -1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] nums=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter the number " + i + " ");
            nums[i]=scan.nextInt();
            if(ispositive(nums[i])){
                if(iseven(nums[i])){
                    System.out.println("Given number is even");
                }else{
                    System.out.println("Given number is odd");
                }
            }else{
                System.out.println("given number is not positive");
            }
        }
        int result=greater(nums[0],nums[4]);
        if(result==1){
            System.out.println("First is greater");
        }else if(result==-1){
            System.out.println("last is greater");
        }else{
            System.out.println("Both are equal");
        }
    }
}
