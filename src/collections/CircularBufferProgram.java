package collections;

public class CircularBufferProgram {

    static int[] buffer = new int[3];
    static int index = 0;

    public static void main(String[] args) {

        add(1);
        add(2);
        add(3);
        add(4); // overwrite

        // printing buffer
        for(int i : buffer) {
            System.out.print(i + " ");
        }
    }

    // adding element
    static void add(int x) {
        buffer[index % buffer.length] = x;
        index++;
    }
}
