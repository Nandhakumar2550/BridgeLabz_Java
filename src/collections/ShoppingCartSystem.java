package collections;

import java.util.*;

public class ShoppingCartSystem {

    public static void main(String[] args) {

        // HashMap to store item → price (no order, fast access)
        Map<String, Integer> priceMap = new HashMap<>();

        // Add items and their prices
        priceMap.put("Pen", 10);
        priceMap.put("Book", 50);
        priceMap.put("Bag", 200);

        // LinkedHashMap to maintain insertion order of cart items
        Map<String, Integer> cart = new LinkedHashMap<>();

        // Add items to cart using priceMap
        cart.put("Book", priceMap.get("Book"));
        cart.put("Pen", priceMap.get("Pen"));

        // TreeMap to sort cart items by key (item name)
        Map<String, Integer> sorted = new TreeMap<>(cart);

        // Display cart (in insertion order)
        System.out.println("Cart: " + cart);

        // Display sorted cart (alphabetical order)
        System.out.println("Sorted Cart: " + sorted);
    }
}