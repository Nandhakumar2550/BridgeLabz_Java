package objectModeling;
import java.util.*;
public class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Faculty: " + name);
    }
}

class Departments {

    String name;

    Departments(String name) {
        this.name = name;
    }
}

class University {

    String name;
    ArrayList<Departments> departments = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Departments d) {
        departments.add(d);
    }
}
