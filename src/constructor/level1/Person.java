package constructor.level1;

public class Person {

    // Instance variable to store person's name
    String name;

    // Instance variable to store person's age
    int age;

    // Parameterized constructor
    Person(String n, int a) {

        // Assign name
        name = n;

        // Assign age
        age = a;
    }

    // Copy constructor
    Person(Person p) {

        // Copy name from another object
        name = p.name;

        // Copy age from another object
        age = p.age;
    }

    void display() {

        // Display person's name
        System.out.println("Name: " + name);

        // Display person's age
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // Create object using parameterized constructor
        Person p1 = new Person("Nandha", 21);

        // Create object using copy constructor
        Person p2 = new Person(p1); // copy constructor

        // Display first object details
        p1.display();

        // Display copied object details
        p2.display();
    }
}