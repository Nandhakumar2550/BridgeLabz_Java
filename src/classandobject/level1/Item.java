package classandobject.level1;

public class Item {
    int itemCode;
    String itemName;
    double price;

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item();

        item.itemCode = 201;
        item.itemName = "Pen";
        item.price = 10;

        item.displayDetails();

        int quantity = 5;
        System.out.println("Total Cost for " + quantity + " items: " + item.calculateTotalCost(quantity));
    }
}
