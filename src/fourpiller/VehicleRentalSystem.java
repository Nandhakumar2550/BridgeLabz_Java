package fourpiller;

import java.util.*;

// Interface for insurance-related functionality
interface Insurable{

    // Method to calculate insurance amount
    double calculateInsurance();
}

// Abstract class representing a vehicle
abstract class Vehicle{

    // Vehicle number
    String number;

    // Rental rate per day
    double rate;

    // Constructor to initialize vehicle details
    Vehicle(String num, double rate){
        this.number = num;
        this.rate = rate;
    }

    // Abstract method to calculate rental cost
    abstract double calculateRentalCost(int days);
}

// Car class inheriting Vehicle and implementing Insurable
class Car extends Vehicle implements Insurable{

    // Constructor calling parent constructor
    Car(String num, double rate){
        super(num, rate);
    }

    // Rental cost = days × rate
    double calculateRentalCost(int days){
        return days * rate;
    }

    // Fixed insurance cost
    public double calculateInsurance(){
        return 500;
    }
}

// Main class
public class VehicleRentalSystem {

    public static void main(String[] args){

        // List to store vehicles (polymorphism)
        List<Vehicle> vehicles = new ArrayList<>();

        // Add a car to the list
        vehicles.add(new Car("TN01", 2000));

        // Iterate through vehicles
        for (Vehicle v : vehicles){

            // Calculate and print rental cost for 3 days
            System.out.println("Rental:" + v.calculateRentalCost(3));

            // Typecasting to access insurance method
            System.out.println("Insurance:" + ((Insurable)v).calculateInsurance());
        }
    }
}