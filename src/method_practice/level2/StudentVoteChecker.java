package method_practice.level2;
import java.util.*;

public class StudentVoteChecker {

    public static boolean vote(int age) {

        if (age >= 18) {
            // Checks if age is eligible for voting

            return true;
            // Eligible to vote

        } else {
            return false;
            // Not eligible
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object

        int[] arr = new int[10];
        // Array to store ages

        for(int i = 1; i <= 10; i++) {

            System.out.println("Enter the age " + i + ":");
            // Prompts user

            arr[i] = scan.nextInt();

            boolean result = vote(arr[i]);
            // Checks voting eligibility

            if(result){
                System.out.println("can vote");
                // Eligible message

            } else {
                System.out.println("Not able vote");
                // Not eligible message
            }
        }

        scan.close();
        // Closes Scanner
    }
}