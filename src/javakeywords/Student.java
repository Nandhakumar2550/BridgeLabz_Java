package javakeywords;

public class Student {

    // Static variable shared across all students
    static String universityName = "Anna University";

    // Static variable to count total students
    static int totalStudents = 0;

    // Instance variable for student name
    String name;

    // Final variable for roll number (cannot be changed)
    final int rollNumber;

    // Grade of the student
    char grade;

    // Constructor to initialize student details
    Student(String name, int rollNumber, char grade) {

        // Assign name
        this.name = name;

        // Assign roll number (final)
        this.rollNumber = rollNumber;

        // Assign grade
        this.grade = grade;

        // Increment total students count
        totalStudents++;
    }

    static void displayTotalStudents() {

        // Static method accessing static variable
        System.out.println("Total Students: " + totalStudents);
    }

    void display() {

        // Display university name (same for all)
        System.out.println("University: " + universityName);

        // Display student name
        System.out.println("Name: " + name);

        // Display roll number
        System.out.println("Roll Number: " + rollNumber);

        // Display grade
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {

        // Create Student object
        Student s = new Student("Nandha", 12, 'A');

        // Check object type using instanceof
        if (s instanceof Student) {

            // Call display method
            s.display();
        }

        // Call static method
        displayTotalStudents();
    }
}