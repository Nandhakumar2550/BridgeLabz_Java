package javakeywords;

public class Employee {

    // Static variable shared across all employees
    static String companyName = "Tech Solutions";

    // Static variable to count total employees
    static int totalEmployees = 0;

    // Instance variable for employee name
    String name;

    // Final variable for employee ID (cannot be changed)
    final int id;

    // Instance variable for designation
    String designation;

    // Constructor to initialize employee details
    Employee(String name, int id, String designation) {

        // Assign name using 'this'
        this.name = name;

        // Assign ID (final variable)
        this.id = id;

        // Assign designation
        this.designation = designation;

        // Increment total employee count
        totalEmployees++;
    }

    static void displayTotalEmployees() {

        // Static method accessing static variable
        System.out.println("Total Employees: " + totalEmployees);
    }

    void display() {

        // Display company name (same for all)
        System.out.println("Company: " + companyName);

        // Display employee name
        System.out.println("Name: " + name);

        // Display employee ID
        System.out.println("ID: " + id);

        // Display designation
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {

        // Create Employee object
        Employee e = new Employee("Nandha", 1, "Developer");

        // Check object type using instanceof
        if (e instanceof Employee) {

            // Call display method
            e.display();
        }

        // Call static method
        displayTotalEmployees();
    }
}