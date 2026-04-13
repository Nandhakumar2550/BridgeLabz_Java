package fourpiller;

// Abstract class representing a food item
abstract class FoodItem{

    // Name of the food item
    String name;

    // Price per unit
    double price;

    // Quantity ordered
    int quantity;

    // Constructor to initialize food item details
    FoodItem(String n, double p, int q){
        name = n;
        price = p;
        quantity = q;
    }

    // Abstract method to calculate total price
    abstract double calculateTotalPrice();
}

// Veg item class
class VegItem extends FoodItem{

    // Constructor calling parent constructor
    VegItem(String n, double p, int q){
        super(n, p, q);
    }

    // Total price = price × quantity
    double calculateTotalPrice(){
        return price * quantity;
    }
}

// Non-veg item class
class NonVegItem extends FoodItem{

    // Constructor calling parent constructor
    NonVegItem(String n, double p, int q){
        super(n, p, q);
    }

    // Total price = (price × quantity) + extra charge (e.g., delivery or service fee)
    double calculateTotalPrice(){
        return price * quantity + 50;
    }
}

// Main class
public class OnlineFoodDeliverySystem {

    public static void main(String[] args){

        // Polymorphism: parent reference, child objects
        FoodItem f1 = new VegItem("Paneer", 200, 2);

        FoodItem f2 = new NonVegItem("Chicken", 300, 2);

        // Calculate and print total prices
        System.out.println(f1.calculateTotalPrice());

        System.out.println(f2.calculateTotalPrice());
    }
}