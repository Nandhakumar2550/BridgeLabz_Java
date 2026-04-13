package objectModeling;

import java.util.*;

// Employee class representing an employee
public class Employee {

    // Name of the employee
    String name;

    // Constructor to initialize employee name
    Employee(String name) {
        this.name = name;
    }

    void display() {

        // Display employee name
        System.out.println("Employee: " + name);
    }
}

// Department class representing a department
class Department {

    // Name of the department
    String deptName;

    // List of employees in this department
    ArrayList<Employee> employees = new ArrayList<>();

    // Constructor to initialize department name
    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(Employee e) {

        // Add employee to department
        employees.add(e);
    }

    void showEmployees() {

        // Display department name
        System.out.println("Department: " + deptName);

        // Display all employees in this department
        for (Employee e : employees) {
            e.display();
        }
    }
}

// Company class representing a company
class Company {

    // Name of the company
    String name;

    // List of departments in the company
    ArrayList<Department> departments = new ArrayList<>();

    // Constructor to initialize company name
    Company(String name) {
        this.name = name;
    }

    void addDepartment(Department d) {

        // Add department to company
        departments.add(d);
    }

    void showCompany() {

        // Display company name
        System.out.println("Company: " + name);

        // Display all departments and their employees
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    public static void main(String[] args) {

        // Create company object
        Company c = new Company("Tech Corp");

        // Create department
        Department d1 = new Department("IT");

        // Add employees to department
        d1.addEmployee(new Employee("Nandha"));
        d1.addEmployee(new Employee("Arun"));

        // Add department to company
        c.addDepartment(d1);

        // Display full company structure
        c.showCompany();
    }
}