package exceptionhandling;

import java.io.*; // importing file handling classes like BufferedReader, FileReader, IOException
import java.util.*; // importing utility classes like List and Arrays

// class to process multiple files
public class FileProcessor {

    // method to read multiple files
    public void processFiles(List<String> filePaths) {

        // looping through file paths
        for(String path : filePaths) {

            // try-with-resources (auto close)
            try(BufferedReader br = new BufferedReader(new FileReader(path))) { // opening file safely

                String line; // variable to store each line

                // reading file content
                while((line = br.readLine()) != null) { // reading line by line until end of file
                    System.out.println(line); // printing each line
                }

            } catch(IOException e) {
                // handling file error
                System.out.println("Error reading file: " + path); // printing error message for failed file
            }
        }
    }

    public static void main(String[] args) {

        FileProcessor fp = new FileProcessor(); // creating FileProcessor object

        // list of files
        List<String> files = Arrays.asList("file1.txt", "file2.txt"); // creating list of file paths

        fp.processFiles(files); // calling method to process files
    }
}