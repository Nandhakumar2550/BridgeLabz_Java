package inheritance;

// Base class representing a general person
public class Person {

    // Name of the person
    String name;

    // Age of the person
    int age;
}

// Teacher class inheriting Person
class Teacher extends Person {

    // Subject taught by teacher
    String subject;

    void displayRole() {

        // Display teacher role with subject
        System.out.println(name + " is a Teacher of " + subject);
    }
}

// Student class inheriting Person
class Student extends Person {

    // Grade of the student
    String grade;

    void displayRole() {

        // Display student role with grade
        System.out.println(name + " is a Student of grade " + grade);
    }
}

// Staff class inheriting Person
class Staff extends Person {

    // Department where staff works
    String department;

    void displayRole() {

        // Display staff role with department
        System.out.println(name + " works in " + department);
    }
}