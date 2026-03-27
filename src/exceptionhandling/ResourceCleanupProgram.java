package exceptionhandling;

// resource cleanup example
public class ResourceCleanupProgram {

    static void connect() {

        System.out.println("Connection opened");

        try {
            int x = 10 / 0; // exception

        } catch(Exception e) {
            System.out.println("Error occurred");

        } finally {
            // cleanup code
            System.out.println("Connection closed");
        }
    }

    public static void main(String[] args) {

        connect();
    }
}
