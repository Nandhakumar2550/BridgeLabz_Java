package exceptionhandling;

// resource cleanup example
public class ResourceCleanupProgram {

    static void connect() {

        System.out.println("Connection opened"); // simulating opening a resource (e.g., DB connection)

        try {
            int x = 10 / 0; // generating ArithmeticException (division by zero)

        } catch(Exception e) {
            System.out.println("Error occurred"); // handling the exception

        } finally {
            // cleanup code
            System.out.println("Connection closed"); // always executed to release/close resource
        }
    }

    public static void main(String[] args) {

        connect(); // calling the method
    }
}