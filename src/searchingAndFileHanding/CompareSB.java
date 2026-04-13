package searchingAndFileHanding;

public class CompareSB {

    public static void main(String[] args) {

        // Number of iterations
        int n = 100000;

        // Start time for StringBuilder
        long start1 = System.nanoTime();

        // Create StringBuilder object (not thread-safe, faster)
        StringBuilder sb1 = new StringBuilder();

        // Append "hello" n times using StringBuilder
        for(int i = 0; i < n; i++)
            sb1.append("hello");

        // End time for StringBuilder
        long end1 = System.nanoTime();

        // Start time for StringBuffer
        long start2 = System.nanoTime();

        // Create StringBuffer object (thread-safe, synchronized)
        StringBuffer sb2 = new StringBuffer();

        // Append "hello" n times using StringBuffer
        for(int i = 0; i < n; i++)
            sb2.append("hello");

        // End time for StringBuffer
        long end2 = System.nanoTime();

        // Print time taken by StringBuilder
        System.out.println("StringBuilder Time: " + (end1 - start1));

        // Print time taken by StringBuffer
        System.out.println("StringBuffer Time: " + (end2 - start2));
    }
}