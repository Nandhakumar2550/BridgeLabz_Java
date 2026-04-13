package javakeywords;

public class Vehicle {

    // Static variable shared across all vehicles
    static double registrationFee = 5000;

    // Instance variable for owner name
    String ownerName;

    // Type of vehicle (Car, Bike, etc.)
    String vehicleType;

    // Final variable for registration number (cannot be changed)
    final String registrationNumber;

    // Constructor to initialize vehicle details
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {

        // Assign owner name
        this.ownerName = ownerName;

        // Assign vehicle type
        this.vehicleType = vehicleType;

        // Assign registration number (final)
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {

        // Update static registration fee
        registrationFee = fee;
    }

    void display() {

        // Display owner name
        System.out.println("Owner: " + ownerName);

        // Display vehicle type
        System.out.println("Vehicle Type: " + vehicleType);

        // Display registration number
        System.out.println("Registration Number: " + registrationNumber);

        // Display registration fee (same for all vehicles)
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void main(String[] args) {

        // Create Vehicle object
        Vehicle v = new Vehicle("Nandha", "Car", "TN01AB1234");

        // Check object type using instanceof
        if (v instanceof Vehicle) {

            // Call display method
            v.display();
        }
    }
}