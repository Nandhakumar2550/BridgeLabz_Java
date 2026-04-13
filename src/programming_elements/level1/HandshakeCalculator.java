package programming_elements.level1;
import java.util.*;

public class HandshakeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creates Scanner object to take user input

        int numberOfStudents;
        // Declares variable to store number of students

        System.out.print("Enter number of students: ");
        // Prompts user to enter number of students

        numberOfStudents = input.nextInt();
        // Reads input from user

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        // Calculates maximum handshakes using formula n(n-1)/2

        System.out.println("The maximum number of possible handshakes is " + handshakes);
        // Displays the result
    }
}