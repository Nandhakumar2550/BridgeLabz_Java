package fourpiller;

// Abstract class representing a vehicle
abstract class Vehicles{

    // Name of the driver
    String driver;

    // Rate per km
    double rate;

    // Constructor to initialize driver and rate
    Vehicles(String d, double r){
        driver = d;
        rate = r;
    }

    // Abstract method to calculate fare based on distance
    abstract double calculateFare(double distance);
}

// Car class inheriting from Vehicles
class Cars extends Vehicles{

    // Constructor calling parent constructor
    Cars(String d, double r){
        super(d, r);
    }

    // Fare calculation = distance × rate
    double calculateFare(double distance){
        return distance * rate;
    }
}

// Main class
public class RideHailingApplication {

    public static void main(String[] args){

        // Polymorphism: parent reference with child object
        Vehicles v = new Cars("Ravi", 15);

        // Calculate and display fare for 10 km
        System.out.println("Fare:" + v.calculateFare(10));
    }
}