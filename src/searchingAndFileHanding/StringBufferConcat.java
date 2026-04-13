package searchingAndFileHanding;

public class StringBufferConcat {

    public static void main(String[] args) {

        // Array of strings to concatenate
        String arr[] = {"Hello", " ", "World", "!"};

        // Create StringBuffer object (thread-safe, mutable)
        StringBuffer sb = new StringBuffer();

        // Iterate through each string in the array
        for(String s : arr)

            // Append each string to StringBuffer
            sb.append(s);

        // Convert StringBuffer to String and print result
        System.out.println(sb.toString());
    }
}