package javakeywords;

public class Product {

    // Static variable for discount (shared by all products)
    static double discount = 10;

    // Instance variable for product name
    String productName;

    // Instance variable for product price
    double price;

    // Quantity of product
    int quantity;

    // Final variable for product ID (cannot be changed)
    final int productID;

    // Constructor to initialize product details
    Product(String productName, double price, int quantity, int productID) {

        // Assign product name
        this.productName = productName;

        // Assign price
        this.price = price;

        // Assign quantity
        this.quantity = quantity;

        // Assign product ID (final)
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {

        // Update static discount value
        discount = newDiscount;
    }

    void display() {

        // Calculate total price
        double total = price * quantity;

        // Apply discount
        double finalPrice = total - (total * discount / 100);

        // Display product details
        System.out.println("Product: " + productName);

        System.out.println("Product ID: " + productID);

        System.out.println("Total Price after Discount: " + finalPrice);
    }

    public static void main(String[] args) {

        // Create Product object
        Product p = new Product("Laptop", 50000, 1, 1001);

        // Check object type using instanceof
        if (p instanceof Product) {

            // Call display method
            p.display();
        }
    }
}