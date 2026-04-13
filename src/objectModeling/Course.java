package objectModeling;

import java.util.*;

// Course class representing a course entity
public class Course {

    // Name of the course
    String courseName;

    // List of students enrolled in this course
    ArrayList<Student> students = new ArrayList<>();

    // Constructor to initialize course name
    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student s) {

        // Add student to course
        students.add(s);
    }

    void showStudents() {

        // Display course name
        System.out.println("Course: " + courseName);

        // Display all students enrolled in this course
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

// Student class representing a student
class Student {

    // Name of student
    String name;

    // List of courses student is enrolled in
    ArrayList<Course> courses = new ArrayList<>();

    // Constructor to initialize student name
    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {

        // Add course to student's list
        courses.add(c);

        // Add student to course (bidirectional relationship)
        c.addStudent(this);
    }

    void viewCourses() {

        // Display student name and enrolled courses
        System.out.println(name + " enrolled in:");

        for (Course c : courses) {
            System.out.println(c.courseName);
        }
    }
}

// School class representing a school entity
class School {

    // Name of the school
    String name;

    // List of students in the school
    ArrayList<Student> students = new ArrayList<>();

    // Constructor to initialize school name
    School(String name) {
        this.name = name;
    }

    void addStudent(Student s) {

        // Add student to school
        students.add(s);
    }
}