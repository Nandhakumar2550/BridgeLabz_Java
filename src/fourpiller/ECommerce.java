package fourpiller;

import java.util.*;

// Interface for tax-related behavior
interface Taxable {

    // Method to calculate tax amount
    double calculateTax();

    // Method to return tax details (e.g., GST %)
    String getTaxDetails();
}

// Abstract class representing a general product
abstract class Product {

    // Private fields (encapsulation)
    private int productId;
    private String name;
    private double price;

    // Constructor to initialize product details
    Product(int id, String name, double price){
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    // Getter for price
    public double getPrice(){
        return price;
    }

    // Abstract method for discount calculation
    abstract double calculateDiscount();

    // Display product basic details
    public void display(){
        System.out.println(name + " Price:" + price);
    }
}

// Electronics category extending Product and implementing Taxable
class Electronics extends Product implements Taxable {

    // Constructor calling parent constructor
    Electronics(int id, String name, double price){
        super(id, name, price);
    }

    // Discount: 10% of price
    double calculateDiscount(){
        return getPrice() * 0.10;
    }

    // Tax: 18% GST
    public double calculateTax(){
        return getPrice() * 0.18;
    }

    // Tax description
    public String getTaxDetails(){
        return "18% GST";
    }
}

// Main class
public class ECommerce {

    public static void main(String[] args) {

        // List to store products (polymorphism)
        List<Product> products = new ArrayList<>();

        // Create Electronics products
        Electronics p1 = new Electronics(1, "Laptop", 50000);
        Electronics p2 = new Electronics(2, "Mobile", 20000);

        // Add products to list
        products.add(p1);
        products.add(p2);

        // Iterate through products
        for (Product p : products){

            // Typecasting to access Taxable methods
            double tax = ((Taxable)p).calculateTax();

            // Final price calculation: price + tax - discount
            double finalPrice = p.getPrice() + tax - p.calculateDiscount();

            // Display product details
            p.display();

            // Display final price
            System.out.println("Final Price:" + finalPrice);
        }
    }
}