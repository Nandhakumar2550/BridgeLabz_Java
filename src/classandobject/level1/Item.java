
package classandobject.level1;

public class Item {

    // Instance variable to store item code
    int itemCode;

    // Instance variable to store item name
    String itemName;

    // Instance variable to store price of one item
    double price;

    void displayDetails() {

        // Print item code
        System.out.println("Item Code: " + itemCode);

        // Print item name
        System.out.println("Item Name: " + itemName);

        // Print price per item
        System.out.println("Price per Item: " + price);
    }

    double calculateTotalCost(int quantity) {

        // Calculate total cost = price * quantity
        return price * quantity;
    }

    public static void main(String[] args) {

        // Create object of Item class
        Item item = new Item();

        // Assign item code
        item.itemCode = 201;

        // Assign item name
        item.itemName = "Pen";

        // Assign price per item
        item.price = 10;

        // Display item details
        item.displayDetails();

        // Quantity of items
        int quantity = 5;

        // Calculate and print total cost
        System.out.println("Total Cost for " + quantity + " items: "
                + item.calculateTotalCost(quantity));
    }
}