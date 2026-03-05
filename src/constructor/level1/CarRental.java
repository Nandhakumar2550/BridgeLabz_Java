package constructor.level1;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    // Constructor
    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double calculateCost() {
        double costPerDay = 2000;
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {

        CarRental r = new CarRental("Nandha", "Toyota", 5);
        r.display();
    }
}
