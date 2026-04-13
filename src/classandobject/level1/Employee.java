package classandobject.level1;

public class Employee {

    // Instance variable to store employee name
    String name;

    // Instance variable to store employee ID
    int id;

    // Instance variable to store employee salary
    double salary;

    void displayDetails() {

        // Print employee name
        System.out.println("Employee Name: " + name);

        // Print employee ID
        System.out.println("Employee ID: " + id);

        // Print employee salary
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        // Create Employee object
        Employee emp = new Employee();

        // Assign name
        emp.name = "Nandha";

        // Assign ID
        emp.id = 101;

        // Assign salary
        emp.salary = 50000;

        // Display employee details
        emp.displayDetails();
    }
}