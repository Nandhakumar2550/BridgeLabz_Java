package fourpiller;

import java.util.*;

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

abstract class Employee {

    private int employeeId;
    private String name;
    private double baseSalary;

    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    abstract double calculateSalary();

    public void displayDetails() {
        System.out.println(employeeId + " " + name);
    }
}

class FullTimeEmployee extends Employee implements Department {

    private String department;

    FullTimeEmployee(int id,String name,double salary){
        super(id,name,salary);
    }

    public double calculateSalary(){
        return getBaseSalary();
    }

    public void assignDepartment(String dept){
        department = dept;
    }

    public String getDepartmentDetails(){
        return department;
    }
}

class PartTimeEmployee extends Employee {

    private int hoursWorked;

    PartTimeEmployee(int id,String name,double salary,int hours){
        super(id,name,salary);
        this.hoursWorked = hours;
    }

    public double calculateSalary(){
        return getBaseSalary()*hoursWorked;
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();

        FullTimeEmployee e1=new FullTimeEmployee(1,"Nandha",50000);
        e1.assignDepartment("IT");

        PartTimeEmployee e2=new PartTimeEmployee(2,"Arun",500,40);

        employees.add(e1);
        employees.add(e2);

        for(Employee e:employees){
            e.displayDetails();
        }
    }
}
