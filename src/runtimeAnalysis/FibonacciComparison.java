package runtimeAnalysis;

public class FibonacciComparison {

    // Recursive method to calculate Fibonacci number
    static int recursive(int n) {

        // Base case: if n is 0 or 1, return n directly
        if (n <= 1) return n;

        // Recursive case: sum of previous two Fibonacci numbers
        return recursive(n - 1) + recursive(n - 2);
    }

    // Iterative method to calculate Fibonacci number
    static int iterative(int n) {

        // Initialize first two Fibonacci numbers
        int a = 0, b = 1, sum;

        // Loop from 2 to n to build Fibonacci sequence
        for (int i = 2; i <= n; i++) {

            // Calculate next Fibonacci number
            sum = a + b;

            // Update values for next iteration
            a = b;
            b = sum;
        }

        // Return the nth Fibonacci number
        return b;
    }

    public static void main(String[] args) {

        // Input value for Fibonacci calculation
        int n = 30;

        // Start time for recursive approach
        long t1 = System.nanoTime();

        // Call recursive method
        recursive(n);

        // Print time taken by recursive method
        System.out.println("Recursive: " + (System.nanoTime() - t1));

        // Start time for iterative approach
        long t2 = System.nanoTime();

        // Call iterative method
        iterative(n);

        // Print time taken by iterative method
        System.out.println("Iterative: " + (System.nanoTime() - t2));
    }
}