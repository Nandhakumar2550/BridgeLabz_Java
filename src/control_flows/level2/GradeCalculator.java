package control_flows.level2;
import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creates Scanner object to take user input

        System.out.println("Enter the physics marks");
        // Prompts user to enter Physics marks

        double physics = scan.nextInt();
        // Reads Physics marks

        System.out.println("Enter the chemistry marks");
        // Prompts user to enter Chemistry marks

        double chemistry = scan.nextInt();
        // Reads Chemistry marks

        System.out.println("Enter the Maths marks");
        // Prompts user to enter Maths marks

        double maths = scan.nextInt();
        // Reads Maths marks

        double percentage = (physics + chemistry + maths) / 3;
        // Calculates average percentage

        String grade;
        String remarks;
        // Declares variables for grade and remarks

        if(percentage >= 90){
            // Checks for grade A

            grade = "A";
            remarks = "Excellent";

        } else if(percentage >= 75){
            // Checks for grade B

            grade = "B";
            remarks = "Very Good";

        } else if(percentage >= 60){
            // Checks for grade C

            grade = "C";
            remarks = "Good";

        } else if(percentage >= 50){
            // Checks for grade D

            grade = "D";
            remarks = "Pass";

        } else {
            // For percentage below 50

            grade = "F";
            remarks = "Fail";
        }

        System.out.println(percentage);
        // Displays percentage

        System.out.println(grade);
        // Displays grade

        System.out.println(remarks);
        // Displays remarks

        scan.close();
        // Closes Scanner
    }
}