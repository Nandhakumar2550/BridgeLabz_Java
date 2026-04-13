package constructor.level1;

public class CarRental {

    // Name of the customer renting the car
    String customerName;

    // Model of the rented car
    String carModel;

    // Number of rental days
    int rentalDays;

    // Constructor to initialize rental details
    CarRental(String c, String m, int d) {

        // Assign customer name
        customerName = c;

        // Assign car model
        carModel = m;

        // Assign rental days
        rentalDays = d;
    }

    double calculateCost() {

        // Cost per day for renting the car
        double costPerDay = 2000;

        // Total cost = rental days × cost per day
        return rentalDays * costPerDay;
    }

    void display() {

        // Display customer name
        System.out.println("Customer Name: " + customerName);

        // Display car model
        System.out.println("Car Model: " + carModel);

        // Display number of rental days
        System.out.println("Rental Days: " + rentalDays);

        // Display total rental cost
        System.out.println("Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {

        // Create CarRental object with given details
        CarRental r = new CarRental("Nandha", "Toyota", 5);

        // Display rental information
        r.display();
    }
}