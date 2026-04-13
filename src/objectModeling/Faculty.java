package objectModeling;

import java.util.*;

// Faculty class representing a faculty member
public class Faculty {

    // Name of the faculty
    String name;

    // Constructor to initialize faculty name
    Faculty(String name) {
        this.name = name;
    }

    void display() {

        // Display faculty details
        System.out.println("Faculty: " + name);
    }
}

// Departments class representing a department
class Departments {

    // Name of the department
    String name;

    // Constructor to initialize department name
    Departments(String name) {
        this.name = name;
    }
}

// University class representing a university
class University {

    // Name of the university
    String name;

    // List of departments in the university
    ArrayList<Departments> departments = new ArrayList<>();

    // Constructor to initialize university name
    University(String name) {
        this.name = name;
    }

    void addDepartment(Departments d) {

        // Add department to university
        departments.add(d);
    }
}