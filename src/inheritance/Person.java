package inheritance;

public class Person {
    String name;
    int age;
}

class Teacher extends Person {

    String subject;

    void displayRole() {
        System.out.println(name + " is a Teacher of " + subject);
    }
}

class Student extends Person {

    String grade;

    void displayRole() {
        System.out.println(name + " is a Student of grade " + grade);
    }
}

class Staff extends Person {

    String department;

    void displayRole() {
        System.out.println(name + " works in " + department);
    }
}
