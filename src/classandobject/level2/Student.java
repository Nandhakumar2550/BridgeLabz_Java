package classandobject.level2;

public class Student {

    // Student name
    String name;

    // Student roll number
    int rollNumber;

    // Marks obtained by student
    int marks;

    char calculateGrade() {

        // Grade A for marks 90 and above
        if (marks >= 90)
            return 'A';

            // Grade B for marks between 75 and 89
        else if (marks >= 75)
            return 'B';

            // Grade C for marks between 50 and 74
        else if (marks >= 50)
            return 'C';

            // Grade F for marks below 50
        else
            return 'F';
    }

    void displayDetails() {

        // Display student name
        System.out.println("Name: " + name);

        // Display roll number
        System.out.println("Roll Number: " + rollNumber);

        // Display marks
        System.out.println("Marks: " + marks);

        // Display calculated grade
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {

        // Create Student object
        Student s = new Student();

        // Assign student name
        s.name = "Nandha";

        // Assign roll number
        s.rollNumber = 12;

        // Assign marks
        s.marks = 85;

        // Display student details
        s.displayDetails();
    }
}