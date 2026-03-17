package runtimeAnalysis;

public class FibonacciComparison {

    static int recursive(int n) {
        if (n <= 1) return n;
        return recursive(n - 1) + recursive(n - 2);
    }

    static int iterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        int n = 30;

        long t1 = System.nanoTime();
        recursive(n);
        System.out.println("Recursive: " + (System.nanoTime() - t1));

        long t2 = System.nanoTime();
        iterative(n);
        System.out.println("Iterative: " + (System.nanoTime() - t2));
    }
}
