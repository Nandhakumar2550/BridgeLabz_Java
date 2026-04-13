package constructor.level1;

public class Circle {

    // Instance variable to store radius
    double radius;

    // Default constructor
    Circle() {

        // Call parameterized constructor with default value 1.0
        this(1.0); // constructor chaining
    }

    // Parameterized constructor
    Circle(double r) {

        // Assign given value to radius
        radius = r;
    }

    double area() {

        // Calculate area using formula πr²
        return Math.PI * radius * radius;
    }

    void display() {

        // Display radius
        System.out.println("Radius: " + radius);

        // Display calculated area
        System.out.println("Area: " + area());
    }

    public static void main(String[] args) {

        // Create object using default constructor
        Circle c1 = new Circle();

        // Create object using parameterized constructor
        Circle c2 = new Circle(5);

        // Display details of first circle
        c1.display();

        // Print blank line
        System.out.println();

        // Display details of second circle
        c2.display();
    }
}