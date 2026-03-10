package inheritance;

interface Refuelable {

    void refuel();
}

class Vehicles {

    int maxSpeed;
    String model;
}

class ElectricVehicle extends Vehicles {

    void charge() {
        System.out.println("Charging vehicle");
    }
}

class PetrolVehicle extends Vehicles implements Refuelable {

    public void refuel() {
        System.out.println("Refueling petrol vehicle");
    }
}
public class HybridVehicle {
    public static void main(String args[]){

    }

}
