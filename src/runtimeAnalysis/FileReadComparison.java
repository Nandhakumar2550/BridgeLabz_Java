package runtimeAnalysis;

import java.io.*;

public class FileReadComparison {

    public static void main(String[] args) {

        // Start time measurement for FileReader approach
        long t1 = System.nanoTime();

        // Try-with-resources to automatically close BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            // Read file line by line until end (null indicates EOF)
            while (br.readLine() != null);

        } catch (Exception e) {
            // Exception is ignored (not recommended in real applications)
        }

        // Print time taken using FileReader
        System.out.println("FileReader: " + (System.nanoTime() - t1));

        // Start time measurement for InputStreamReader approach
        long t2 = System.nanoTime();

        // Try-with-resources with InputStreamReader wrapped in BufferedReader
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("test.txt")))) {

            // Read file line by line until end
            while (br.readLine() != null);

        } catch (Exception e) {
            // Exception is ignored (not recommended in real applications)
        }

        // Print time taken using InputStreamReader
        System.out.println("InputStreamReader: " + (System.nanoTime() - t2));
    }
}