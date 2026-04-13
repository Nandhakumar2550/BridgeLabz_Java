package classandobject.level2;

public class CartItem {

    // Name of the item in cart
    String itemName;

    // Price of single item
    double price;

    // Quantity of item in cart
    int quantity;

    void addItem(int qty) {

        // Increase quantity when items are added to cart
        quantity += qty;
    }

    void removeItem(int qty) {

        // Check if enough quantity is available to remove
        if (quantity >= qty)

            // Reduce quantity if valid
            quantity -= qty;

        else

            // Error message if removal is not possible
            System.out.println("Not enough quantity to remove");
    }

    double calculateTotal() {

        // Total cost = price × quantity
        return price * quantity;
    }

    void displayTotal() {

        // Display item name
        System.out.println("Item: " + itemName);

        // Display quantity in cart
        System.out.println("Quantity: " + quantity);

        // Display total cost
        System.out.println("Total Cost: " + calculateTotal());
    }

    public static void main(String[] args) {

        // Create CartItem object
        CartItem item = new CartItem();

        // Set item name
        item.itemName = "Laptop";

        // Set price of item
        item.price = 50000;

        // Add items to cart
        item.addItem(2);

        // Remove one item
        item.removeItem(1);

        // Display final cart details
        item.displayTotal();
    }
}