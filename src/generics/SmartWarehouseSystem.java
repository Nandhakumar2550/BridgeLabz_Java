package generics;

import java.util.*;

// Base class for all items
abstract class WarehouseItem {
    String name;

    // constructor to set item name
    WarehouseItem(String name) {
        this.name = name;
    }

    // method to display item
    void show() {
        System.out.println(name);
    }
}

// Electronics item class
class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name); // calling parent constructor
    }
}

// Groceries item class
class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}

// Generic storage class to store any type of WarehouseItem
class Storage<T extends WarehouseItem> {
    List<T> list = new ArrayList<>();

    // adding item into storage
    void add(T item) {
        list.add(item);
    }

    // returning all items
    List<T> get() {
        return list;
    }
}

// Main class
public class SmartWarehouseSystem {

    // wildcard method to display any type of item
    static void display(List<? extends WarehouseItem> items) {
        for (WarehouseItem i : items) {
            i.show();
        }
    }

    public static void main(String[] args) {

        // created storage for Electronics
        Storage<Electronics> s1 = new Storage<>();
        s1.add(new Electronics("Laptop"));

        // created storage for Groceries
        Storage<Groceries> s2 = new Storage<>();
        s2.add(new Groceries("Rice"));

        // displaying all items
        display(s1.get());
        display(s2.get());
    }
}
