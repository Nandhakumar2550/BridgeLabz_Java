package inheritance;

// Base class representing a general employee
public class Employee {

    // Employee name
    String name;

    // Employee ID
    int id;

    // Employee salary
    double salary;

    void displayDetails() {

        // Display name
        System.out.println("Name: " + name);

        // Display ID
        System.out.println("ID: " + id);

        // Display salary
        System.out.println("Salary: " + salary);
    }
}

// Manager class inheriting Employee
class Manager extends Employee {

    // Number of team members managed
    int teamSize;

    void displayDetails() {

        // Call parent method to display common details
        super.displayDetails();

        // Display manager-specific detail
        System.out.println("Team Size: " + teamSize);
    }
}

// Developer class inheriting Employee
class Developer extends Employee {

    // Programming language used by developer
    String programmingLanguage;

    void displayDetails() {

        // Call parent method
        super.displayDetails();

        // Display developer-specific detail
        System.out.println("Language: " + programmingLanguage);
    }
}

// Intern class inheriting Employee
class Intern extends Employee {

    // Internship duration in months
    int duration;

    void displayDetails() {

        // Call parent method
        super.displayDetails();

        // Display intern-specific detail
        System.out.println("Internship Duration: " + duration + " months");
    }
}