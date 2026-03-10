package inheritance;

public class Vehicle {
    int maxSpeed;
    String fuelType;

    void displayInfo() {
        System.out.println("Speed: " + maxSpeed);
        System.out.println("Fuel: " + fuelType);
    }
}

class Car extends Vehicle {

    int seatCapacity;

    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {

    int loadCapacity;

    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
    }
}

class Motorcycle extends Vehicle {

    boolean hasCarrier;

    void displayInfo() {
        super.displayInfo();
        System.out.println("Carrier: " + hasCarrier);
    }
}

class TestVehicle {

    public static void main(String[] args) {

        Vehicle v[] = new Vehicle[3];

        v[0] = new Car();
        v[1] = new Truck();
        v[2] = new Motorcycle();

        for (Vehicle vehicle : v) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
