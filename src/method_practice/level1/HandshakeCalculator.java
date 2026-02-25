package method_practice.level1;
import java.util.*;
public class HandshakeCalculator {
    public static int handshake(int num) {
    int hands = (num * (num - 1)) / 2;
    return hands;
}
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of student");
        int num=scan.nextInt();
        int result=handshake(num);
        System.out.println("Maximum number of handshakes is " + result);
    }
}
