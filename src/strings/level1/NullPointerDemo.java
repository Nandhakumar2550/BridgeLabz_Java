package strings.level1;

public class NullPointerDemo {

    public static void generateException() {

        // String reference is set to null (no object in memory)
        String text = null;

        // This will throw NullPointerException because text is null
        System.out.println(text.length()); // Exception
    }

    public static void handleException() {

        try {

            // String reference is null
            String text = null;

            // Attempting to access method on null reference causes exception
            System.out.println(text.length());

        }
        // Handles NullPointerException safely
        catch (NullPointerException e) {

            System.out.println("Handled NullPointerException");
        }
    }

    public static void main(String[] args) {

        // Calling safe method with exception handling
        handleException();
    }
}