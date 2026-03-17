package runtimeAnalysis;

import java.io.*;

public class FileReadComparison {

    public static void main(String[] args) {

        // FileReader
        long t1 = System.nanoTime();
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while (br.readLine() != null);
        } catch (Exception e) {}
        System.out.println("FileReader: " + (System.nanoTime() - t1));

        // InputStreamReader
        long t2 = System.nanoTime();
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("test.txt")))) {
            while (br.readLine() != null);
        } catch (Exception e) {}
        System.out.println("InputStreamReader: " + (System.nanoTime() - t2));
    }
}
