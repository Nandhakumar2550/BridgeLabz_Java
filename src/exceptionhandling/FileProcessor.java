package exceptionhandling;

import java.io.*;
import java.util.*;

// class to process multiple files
public class FileProcessor {

    // method to read multiple files
    public void processFiles(List<String> filePaths) {

        // looping through file paths
        for(String path : filePaths) {

            // try-with-resources (auto close)
            try(BufferedReader br = new BufferedReader(new FileReader(path))) {

                String line;

                // reading file content
                while((line = br.readLine()) != null) {
                    System.out.println(line);
                }

            } catch(IOException e) {
                // handling file error
                System.out.println("Error reading file: " + path);
            }
        }
    }

    public static void main(String[] args) {

        FileProcessor fp = new FileProcessor();

        // list of files
        List<String> files = Arrays.asList("file1.txt", "file2.txt");

        fp.processFiles(files);
    }
}
