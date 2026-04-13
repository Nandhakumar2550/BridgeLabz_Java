package method_practice.level1;
import java.util.*;

public class HandshakeCalculator {

    public static int handshake(int num) {

        int hands = (num * (num - 1)) / 2;
        // Calculates number of handshakes using formula n(n-1)/2

        return hands;
        // Returns result
    }

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the number of student");
        // Prompts user to enter number of students

        int num = scan.nextInt();
        // Reads number of students

        int result = handshake(num);
        // Calls method to calculate handshakes

        System.out.println("Maximum number of handshakes is " + result);
        // Displays result

        scan.close();
        // Closes Scanner
    }
}