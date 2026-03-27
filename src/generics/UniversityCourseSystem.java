package generics;

import java.util.*;

// base class for course types
abstract class CourseType {

    // method to evaluate course
    void evaluate() {
        System.out.println("Evaluating...");
    }
}

// different course types
class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}

// generic class to manage courses
class Course<T extends CourseType> {
    List<T> list = new ArrayList<>();

    // adding course
    void add(T c) {
        list.add(c);
    }

    // returning courses
    List<T> get() {
        return list;
    }
}

// main class
public class UniversityCourseSystem {

    // wildcard method to show all course types
    static void show(List<? extends CourseType> list) {
        for (CourseType c : list) {
            c.evaluate();
        }
    }

    public static void main(String[] args) {

        // created course list for exam type
        Course<ExamCourse> c1 = new Course<>();
        c1.add(new ExamCourse());

        // displaying courses
        show(c1.get());
    }
}