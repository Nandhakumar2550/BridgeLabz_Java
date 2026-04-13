package objectModeling;

import java.util.*;

// Courses class representing a course
public class Courses {

    // Name of the course
    String name;

    // Constructor to initialize course name
    Courses(String name) {
        this.name = name;
    }
}

// Professor class representing a professor
class Professor {

    // Name of the professor
    String name;

    // Constructor to initialize professor name
    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Courses c) {

        // Assign course to professor (teaching relationship)
        System.out.println(name + " teaches " + c.name);
    }
}

// Students class representing a student
class Students {

    // Name of the student
    String name;

    // List of courses the student is enrolled in
    ArrayList<Courses> courseA = new ArrayList<>();

    // Constructor to initialize student name
    Students(String name) {
        this.name = name;
    }

    void enrollCourse(Courses c) {

        // Add course to student's list
        courseA.add(c);

        // Display enrollment message
        System.out.println(name + " enrolled in " + c.name);
    }
}

// Main class
class UniversityTest {

    public static void main(String[] args) {

        // Create course objects
        Courses c1 = new Courses("Java Programming");
        Courses c2 = new Courses("Data Structures");

        // Create professor object
        Professor p1 = new Professor("Dr. Kumar");

        // Create student object
        Students s1 = new Students("Nandha");

        // Assign course to professor
        p1.assignCourse(c1);

        // Enroll student in courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
    }
}