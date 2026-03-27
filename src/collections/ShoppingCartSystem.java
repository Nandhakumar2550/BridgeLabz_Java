package collections;

import java.util.*;

public class ShoppingCartSystem {

    public static void main(String[] args) {

        // HashMap for prices
        Map<String, Integer> priceMap = new HashMap<>();
        priceMap.put("Pen", 10);
        priceMap.put("Book", 50);
        priceMap.put("Bag", 200);

        // LinkedHashMap for order of items added
        Map<String, Integer> cart = new LinkedHashMap<>();
        cart.put("Book", priceMap.get("Book"));
        cart.put("Pen", priceMap.get("Pen"));

        // TreeMap for sorted items
        Map<String, Integer> sorted = new TreeMap<>(cart);

        // display cart
        System.out.println("Cart: " + cart);
        System.out.println("Sorted Cart: " + sorted);
    }
}