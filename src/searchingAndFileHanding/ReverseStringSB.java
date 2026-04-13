package searchingAndFileHanding;

public class ReverseStringSB {

    public static void main(String[] args) {

        // Input string to be reversed
        String str = "hello";

        // Create StringBuilder object initialized with the string
        StringBuilder sb = new StringBuilder(str);

        // Reverse the string using built-in reverse() method
        sb.reverse();

        // Convert StringBuilder back to String and print result
        System.out.println(sb.toString());
    }
}