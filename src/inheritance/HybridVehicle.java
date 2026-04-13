package inheritance;

// Interface for refueling capability
interface Refuelable {

    // Method to refuel vehicle
    void refuel();
}

// Base class representing common vehicle properties
class Vehicles {

    // Maximum speed of vehicle
    int maxSpeed;

    // Model name of vehicle
    String model;
}

// Electric vehicle class
class ElectricVehicle extends Vehicles {

    void charge() {

        // Charging operation for electric vehicle
        System.out.println("Charging vehicle");
    }
}

// Petrol vehicle class implementing Refuelable interface
class PetrolVehicle extends Vehicles implements Refuelable {

    public void refuel() {

        // Refueling operation for petrol vehicle
        System.out.println("Refueling petrol vehicle");
    }
}

// Main class
public class HybridVehicle {

    public static void main(String args[]){

        // Create electric vehicle object
        ElectricVehicle ev = new ElectricVehicle();

        ev.model = "Tesla";
        ev.maxSpeed = 200;

        // Call charge method
        ev.charge();

        // Create petrol vehicle object
        PetrolVehicle pv = new PetrolVehicle();

        pv.model = "Honda";
        pv.maxSpeed = 180;

        // Call refuel method
        pv.refuel();
    }
}