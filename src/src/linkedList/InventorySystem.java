package linkedList;

class ItemNode {

    int id;
    String name;
    int quantity;
    double price;

    ItemNode next;

    ItemNode(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

public class InventorySystem {

    ItemNode head;

    void addItem(int id, String name, int q, double p) {

        ItemNode newNode = new ItemNode(id, name, q, p);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    void totalValue() {

        double total = 0;

        ItemNode temp = head;

        while (temp != null) {

            total += temp.price * temp.quantity;

            temp = temp.next;
        }

        System.out.println("Total Value = " + total);
    }

    void display() {

        ItemNode temp = head;

        while (temp != null) {

            System.out.println(temp.id + " " + temp.name + " " + temp.quantity);

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        InventorySystem inv = new InventorySystem();

        inv.addItem(1, "Pen", 10, 5);
        inv.addItem(2, "Book", 5, 50);

        inv.display();

        inv.totalValue();
    }
}
