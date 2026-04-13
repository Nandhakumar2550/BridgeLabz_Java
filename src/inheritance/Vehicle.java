package inheritance;

// Base class representing a general vehicle
public class Vehicle {

    // Maximum speed of vehicle
    int maxSpeed;

    // Type of fuel used
    String fuelType;

    void displayInfo() {

        // Display speed
        System.out.println("Speed: " + maxSpeed);

        // Display fuel type
        System.out.println("Fuel: " + fuelType);
    }
}

// Car class inheriting Vehicle
class Car extends Vehicle {

    // Number of seats in car
    int seatCapacity;

    void displayInfo() {

        // Call parent method
        super.displayInfo();

        // Display car-specific detail
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Truck class inheriting Vehicle
class Truck extends Vehicle {

    // Load capacity of truck
    int loadCapacity;

    void displayInfo() {

        // Call parent method
        super.displayInfo();

        // Display truck-specific detail
        System.out.println("Load Capacity: " + loadCapacity);
    }
}

// Motorcycle class inheriting Vehicle
class Motorcycle extends Vehicle {

    // Whether motorcycle has carrier or not
    boolean hasCarrier;

    void displayInfo() {

        // Call parent method
        super.displayInfo();

        // Display motorcycle-specific detail
        System.out.println("Carrier: " + hasCarrier);
    }
}

// Main class
class TestVehicle {

    public static void main(String[] args) {

        // Array of Vehicle references (polymorphism)
        Vehicle v[] = new Vehicle[3];

        // Assign different child objects
        v[0] = new Car();
        v[1] = new Truck();
        v[2] = new Motorcycle();

        // Iterate through array
        for (Vehicle vehicle : v) {

            // Dynamic method dispatch (calls respective class method)
            vehicle.displayInfo();

            // Print empty line for formatting
            System.out.println();
        }
    }
}