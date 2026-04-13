package runtimeAnalysis;

public class StringPerformance {

    public static void main(String[] args) {

        // Number of iterations for string operations
        int n = 100000;

        // Measure time for String (immutable)
        long t1 = System.nanoTime();

        // Initialize empty String
        String s = "";

        // Concatenate "a" n times (creates new object each time)
        for (int i = 0; i < n; i++)
            s += "a";

        // Print time taken by String concatenation
        System.out.println("String: " + (System.nanoTime() - t1));

        // Measure time for StringBuilder (mutable, not thread-safe)
        long t2 = System.nanoTime();

        // Create StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append "a" n times (modifies same object)
        for (int i = 0; i < n; i++)
            sb.append("a");

        // Print time taken by StringBuilder
        System.out.println("StringBuilder: " + (System.nanoTime() - t2));

        // Measure time for StringBuffer (mutable, thread-safe)
        long t3 = System.nanoTime();

        // Create StringBuffer object
        StringBuffer sbf = new StringBuffer();

        // Append "a" n times (synchronized, thread-safe)
        for (int i = 0; i < n; i++)
            sbf.append("a");

        // Print time taken by StringBuffer
        System.out.println("StringBuffer: " + (System.nanoTime() - t3));
    }
}