package collections;

import java.util.*;

// Employee class
class Employee {

    // Name of employee
    String name;

    // Department of employee
    String department;

    // Constructor to initialize employee details
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Override toString() to print employee name
    public String toString() {
        return name;
    }
}

// main class
public class EmployeeGroupingSystem {

    public static void main(String[] args) {

        // Create list to store employees
        List<Employee> list = new ArrayList<>();

        // Add employee objects to list
        list.add(new Employee("Alice", "HR"));
        list.add(new Employee("Bob", "IT"));
        list.add(new Employee("Carol", "HR"));

        // Map to group employees by department
        Map<String, List<Employee>> map = new HashMap<>();

        // Traverse each employee
        for(Employee e : list) {

            // If department key is not present, create new list
            map.putIfAbsent(e.department, new ArrayList<>());

            // Add employee to corresponding department list
            map.get(e.department).add(e);
        }

        // Print grouped employees
        for(String dept : map.keySet()) {

            // Print department and list of employees
            System.out.println(dept + " : " + map.get(dept));
        }
    }
}