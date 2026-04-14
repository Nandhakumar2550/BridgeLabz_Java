package collections;

public class CircularBufferProgram {

    // Fixed-size buffer array
    static int[] buffer = new int[3];

    // Index to track insertion position
    static int index = 0;

    public static void main(String[] args) {

        // Add elements to buffer
        add(1);
        add(2);
        add(3);

        // This will overwrite the oldest element (1)
        add(4);

        // Print buffer contents
        for(int i : buffer) {
            System.out.print(i + " ");
        }
    }

    // Method to add element to circular buffer
    static void add(int x) {

        // Insert element using modulo to wrap around
        buffer[index % buffer.length] = x;

        // Increment index for next insertion
        index++;
    }
}