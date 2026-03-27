package collections;

import java.util.*;

// Employee class
class Employee {
    String name;
    String department;

    // constructor
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // to print employee name
    public String toString() {
        return name;
    }
}

// main class
public class EmployeeGroupingSystem {

    public static void main(String[] args) {

        // created employee list
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alice", "HR"));
        list.add(new Employee("Bob", "IT"));
        list.add(new Employee("Carol", "HR"));

        // map to group employees by department
        Map<String, List<Employee>> map = new HashMap<>();

        // grouping logic
        for(Employee e : list) {

            // if department not present, create new list
            map.putIfAbsent(e.department, new ArrayList<>());

            // add employee to that department
            map.get(e.department).add(e);
        }

        // printing result
        for(String dept : map.keySet()) {
            System.out.println(dept + " : " + map.get(dept));
        }
    }
}
