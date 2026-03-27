package exceptionhandling;

import java.io.*;

// reading two files and writing to third
public class MultiFileProcessor {

    public static void main(String[] args) {

        // try with multiple resources
        try(
                BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
                BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))
        ) {

            String line;

            // reading file1
            while((line = br1.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            // reading file2
            while((line = br2.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

        } catch(IOException e) {
            System.out.println("Error processing files");
        }
    }
}
