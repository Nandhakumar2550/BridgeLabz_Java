package fourpiller;

import java.util.*;

// Interface for department-related operations
interface Department {

    // Assign department to employee
    void assignDepartment(String dept);

    // Get department details
    String getDepartmentDetails();
}

// Abstract class representing common employee structure
abstract class Employee {

    // Private fields (encapsulation)
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor to initialize employee details
    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter for employee ID
    public int getEmployeeId() { return employeeId; }

    // Getter for name
    public String getName() { return name; }

    // Getter for base salary
    public double getBaseSalary() { return baseSalary; }

    // Abstract method for salary calculation
    abstract double calculateSalary();

    // Display basic employee details
    public void displayDetails() {
        System.out.println(employeeId + " " + name);
    }
}

// Full-time employee class
class FullTimeEmployee extends Employee implements Department {

    // Department field
    private String department;

    // Constructor calling parent constructor
    FullTimeEmployee(int id, String name, double salary){
        super(id, name, salary);
    }

    // Salary calculation (fixed salary)
    public double calculateSalary(){
        return getBaseSalary();
    }

    // Assign department
    public void assignDepartment(String dept){
        department = dept;
    }

    // Return department details
    public String getDepartmentDetails(){
        return department;
    }
}

// Part-time employee class
class PartTimeEmployee extends Employee {

    // Number of hours worked
    private int hoursWorked;

    // Constructor
    PartTimeEmployee(int id, String name, double salary, int hours){
        super(id, name, salary);
        this.hoursWorked = hours;
    }

    // Salary = hourly rate × hours worked
    public double calculateSalary(){
        return getBaseSalary() * hoursWorked;
    }
}

// Main class
public class EmployeeManagementSystem {

    public static void main(String[] args) {

        // List to store employees (polymorphism)
        List<Employee> employees = new ArrayList<>();

        // Create full-time employee
        FullTimeEmployee e1 = new FullTimeEmployee(1, "Nandha", 50000);

        // Assign department
        e1.assignDepartment("IT");

        // Create part-time employee
        PartTimeEmployee e2 = new PartTimeEmployee(2, "Arun", 500, 40);

        // Add employees to list
        employees.add(e1);
        employees.add(e2);

        // Iterate and display employee details
        for (Employee e : employees){
            e.displayDetails();
        }
    }
}