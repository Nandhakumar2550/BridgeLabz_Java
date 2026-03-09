package objectModeling;
import java.util.*;
public class Courses {

    String name;

    Courses(String name) {
        this.name = name;
    }
}

class Professor {

    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Courses c) {
        System.out.println(name + " teaches " + c.name);
    }
}

class Students {

    String name;
    ArrayList<Courses> courseA = new ArrayList<>();

    Students(String name) {
        this.name = name;
    }

    void enrollCourse(Courses c) {
        courseA.add(c);
        System.out.println(name + " enrolled in " + c.name);
    }
}

class UniversityTest {

    public static void main(String[] args) {

        Courses c1 = new Courses("Java Programming");
        Courses c2 = new Courses("Data Structures");

        Professor p1 = new Professor("Dr. Kumar");

        Students s1 = new Students("Nandha");

        p1.assignCourse(c1);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
    }
}