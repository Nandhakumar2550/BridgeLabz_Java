package classandobject.level1;

public class MobilePhone {

    // Instance variable to store phone brand
    String brand;

    // Instance variable to store phone model
    String model;

    // Instance variable to store phone price
    double price;

    void displayDetails() {

        // Print phone brand
        System.out.println("Brand: " + brand);

        // Print phone model
        System.out.println("Model: " + model);

        // Print phone price
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        // Create MobilePhone object
        MobilePhone phone = new MobilePhone();

        // Assign brand value
        phone.brand = "Samsung";

        // Assign model value
        phone.model = "Galaxy S24";

        // Assign price value
        phone.price = 75000;

        // Display phone details
        phone.displayDetails();
    }
}