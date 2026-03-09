package javakeywords;

public class Student {
    static String universityName = "Anna University";
    static int totalStudents = 0;

    String name;
    final int rollNumber;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void display() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {

        Student s = new Student("Nandha", 12, 'A');

        if (s instanceof Student) {
            s.display();
        }

        displayTotalStudents();
    }
}
