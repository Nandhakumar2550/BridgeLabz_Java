package exceptionhandling;

// nested try-catch
public class NestedTryCatchProgram {

    public static void main(String[] args) {

        int[] arr = {10,20,30}; // initializing array with 3 elements
        int index = 2; // valid index
        int divisor = 0; // divisor set to zero (will cause exception)

        try {
            // outer try
            try {
                int value = arr[index]; // accessing array element

                // inner try for division
                int result = value / divisor; // division by zero → ArithmeticException

                System.out.println(result); // printing result (won't execute if exception occurs)

            } catch(ArithmeticException e) {
                System.out.println("Cannot divide by zero!"); // handling division error
            }

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!"); // handling invalid index error
        }
    }
}