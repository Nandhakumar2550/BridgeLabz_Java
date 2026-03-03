package classandobject.level2;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (quantity >= qty)
            quantity -= qty;
        else
            System.out.println("Not enough quantity to remove");
    }

    double calculateTotal() {
        return price * quantity;
    }

    void displayTotal() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotal());
    }

    public static void main(String[] args) {
        CartItem item = new CartItem();

        item.itemName = "Laptop";
        item.price = 50000;

        item.addItem(2);
        item.removeItem(1);

        item.displayTotal();
    }
}
