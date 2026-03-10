package fourpiller;
import java.util.*;

interface Insurable{
    double calculateInsurance();
}

abstract class Vehicle{

    String number;
    double rate;

    Vehicle(String num,double rate){
        this.number=num;
        this.rate=rate;
    }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable{

    Car(String num,double rate){
        super(num,rate);
    }

    double calculateRentalCost(int days){
        return days*rate;
    }

    public double calculateInsurance(){
        return 500;
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args){

        List<Vehicle> vehicles=new ArrayList<>();

        vehicles.add(new Car("TN01",2000));

        for(Vehicle v:vehicles){
            System.out.println("Rental:"+v.calculateRentalCost(3));
            System.out.println("Insurance:"+((Insurable)v).calculateInsurance());
        }
    }
}
