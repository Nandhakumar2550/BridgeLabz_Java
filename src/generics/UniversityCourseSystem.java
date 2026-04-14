package generics;

import java.util.*; // importing utility classes like List and ArrayList

// base class for course types
abstract class CourseType {

    // method to evaluate course
    void evaluate() {
        System.out.println("Evaluating..."); // common evaluation logic
    }
}

// different course types
class ExamCourse extends CourseType {} // inherits evaluate()
class AssignmentCourse extends CourseType {} // inherits evaluate()

// generic class to manage courses
class Course<T extends CourseType> {
    List<T> list = new ArrayList<>(); // list to store course objects

    // adding course
    void add(T c) {
        list.add(c); // adding course to list
    }

    // returning courses
    List<T> get() {
        return list; // returning list of courses
    }
}

// main class
public class UniversityCourseSystem {

    // wildcard method to show all course types
    static void show(List<? extends CourseType> list) {
        for (CourseType c : list) { // iterating through course list
            c.evaluate(); // calling evaluate method
        }
    }

    public static void main(String[] args) {

        // created course list for exam type
        Course<ExamCourse> c1 = new Course<>(); // creating Course object for ExamCourse
        c1.add(new ExamCourse()); // adding exam course

        // displaying courses
        show(c1.get()); // displaying all courses using wildcard method
    }
}