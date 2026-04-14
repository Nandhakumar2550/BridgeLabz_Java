package generics;

import java.util.*; // importing utility classes like List and ArrayList

// Base class for all items
abstract class WarehouseItem {
    String name; // item name

    // constructor to set item name
    WarehouseItem(String name) {
        this.name = name; // assigning name
    }

    // method to display item
    void show() {
        System.out.println(name); // printing item name
    }
}

// Electronics item class
class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name); // calling parent constructor to set name
    }
}

// Groceries item class
class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name); // calling parent constructor
    }
}

// Generic storage class to store any type of WarehouseItem
class Storage<T extends WarehouseItem> {
    List<T> list = new ArrayList<>(); // list to store items

    // adding item into storage
    void add(T item) {
        list.add(item); // adding item to list
    }

    // returning all items
    List<T> get() {
        return list; // returning stored items
    }
}

// Main class
public class SmartWarehouseSystem {

    // wildcard method to display any type of item
    static void display(List<? extends WarehouseItem> items) {
        for (WarehouseItem i : items) { // iterating through list
            i.show(); // displaying each item
        }
    }

    public static void main(String[] args) {

        // created storage for Electronics
        Storage<Electronics> s1 = new Storage<>(); // creating storage for Electronics
        s1.add(new Electronics("Laptop")); // adding item

        // created storage for Groceries
        Storage<Groceries> s2 = new Storage<>(); // creating storage for Groceries
        s2.add(new Groceries("Rice")); // adding item

        // displaying all items
        display(s1.get()); // displaying electronics items
        display(s2.get()); // displaying groceries items
    }
}