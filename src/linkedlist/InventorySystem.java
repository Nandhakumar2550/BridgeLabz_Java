package linkedlist;

// Node class representing each item in the linked list
class ItemNode {

    // Item ID
    int id;

    // Item name
    String name;

    // Quantity of item
    int quantity;

    // Price per item
    double price;

    // Reference to next node
    ItemNode next;

    // Constructor to initialize node data
    ItemNode(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

// Main class implementing inventory system using linked list
public class InventorySystem {

    // Head of the linked list
    ItemNode head;

    void addItem(int id, String name, int q, double p) {

        // Create new node
        ItemNode newNode = new ItemNode(id, name, q, p);

        // If list is empty, set new node as head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to last node
        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        // Add new node at end
        temp.next = newNode;
    }

    void totalValue() {

        // Variable to store total inventory value
        double total = 0;

        // Start from head
        ItemNode temp = head;

        // Traverse list
        while (temp != null) {

            // Add (price × quantity) for each item
            total += temp.price * temp.quantity;

            temp = temp.next;
        }

        // Display total value
        System.out.println("Total Value = " + total);
    }

    void display() {

        // Start from head
        ItemNode temp = head;

        // Traverse list
        while (temp != null) {

            // Display item details
            System.out.println(temp.id + " " + temp.name + " " + temp.quantity);

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        // Create InventorySystem object
        InventorySystem inv = new InventorySystem();

        // Add items to inventory
        inv.addItem(1, "Pen", 10, 5);
        inv.addItem(2, "Book", 5, 50);

        // Display all items
        inv.display();

        // Calculate total inventory value
        inv.totalValue();
    }
}