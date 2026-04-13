package classandobject.level1;

public class Circle {

    // Instance variable to store radius of circle
    double radius;

    double calculateArea() {

        // Area formula: πr²
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {

        // Circumference formula: 2πr
        return 2 * Math.PI * radius;
    }

    void display() {

        // Print radius value
        System.out.println("Radius: " + radius);

        // Print calculated area
        System.out.println("Area: " + calculateArea());

        // Print calculated circumference
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {

        // Create Circle object
        Circle c = new Circle();

        // Assign radius value
        c.radius = 5;

        // Display circle details
        c.display();
    }
}