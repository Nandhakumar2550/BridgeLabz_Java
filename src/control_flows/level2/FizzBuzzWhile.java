package control_flows.level2;
import java.util.*;
public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        if(num>0){
            int count=1;
            while(count<=num){
                if(count%3==0 && count%5==0){
                    System.out.println("FizzBuzz");
                }else if(count%3==0){
                    System.out.println("Fizz");
                }else if(count%5==0){
                    System.out.println("Buzz");
                }else{
                    System.out.println(count);
                }
                count++;
            }
        }else{
            System.out.println("Enter the positive value");
        }
        scan.close();
    }
}
