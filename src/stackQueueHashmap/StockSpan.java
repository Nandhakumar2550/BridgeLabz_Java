package stackQueueHashmap;

import java.util.Stack;

public class StockSpan {

    // Method to calculate stock span for each day
    static void calculateSpan(int price[]) {

        // Stack to store indices of stock prices
        Stack<Integer> stack = new Stack<>();

        // Array to store span values
        int span[] = new int[price.length];

        // First day span is always 1
        stack.push(0);
        span[0] = 1;

        // Traverse prices from second day
        for (int i = 1; i < price.length; i++) {

            // Remove indices whose prices are less than or equal to current price
            while (!stack.isEmpty() && price[i] >= price[stack.peek()])
                stack.pop();

            // If stack is empty → span is i+1 (all previous smaller)
            // Else → difference between current index and last greater element
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index onto stack
            stack.push(i);
        }

        // Print span values
        for (int s : span)
            System.out.print(s + " ");
    }

    public static void main(String[] args) {

        // Stock prices array
        int price[] = {100, 80, 60, 70, 60, 75, 85};

        // Calculate and print spans
        calculateSpan(price);
    }
}