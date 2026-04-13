package objectModeling;

import java.util.*;

// Product class representing a product
public class Product {

    // Name of the product
    String name;

    // Price of the product
    double price;

    // Constructor to initialize product details
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// Order class representing a customer's order
class Order {

    // List of products in the order
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {

        // Add product to order
        products.add(p);
    }

    void showOrder() {

        // Display all products in the order
        for (Product p : products) {
            System.out.println(p.name + " - " + p.price);
        }
    }
}

// Customers class representing a customer
class Customers {

    // Name of the customer
    String name;

    // Constructor to initialize customer name
    Customers(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {

        // Display order placement message
        System.out.println(name + " placed an order:");

        // Show order details
        o.showOrder();
    }
}