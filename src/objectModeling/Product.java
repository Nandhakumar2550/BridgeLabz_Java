package objectModeling;
import java.util.*;
public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {

    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrder() {
        for (Product p : products) {
            System.out.println(p.name + " - " + p.price);
        }
    }
}

class Customers {

    String name;

    Customers(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        System.out.println(name + " placed an order:");
        o.showOrder();
    }
}
