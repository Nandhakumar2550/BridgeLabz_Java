package exceptionhandling;

// array exception handling
public class ArrayExceptionProgram {

    public static void main(String[] args) {

        try {
            int[] arr = {10,20,30}; // declaring and initializing an array with 3 elements

            int index = 5; // assigning an index value (out of bounds)

            // accessing array
            System.out.println("Value: " + arr[index]); // trying to access invalid index

        } catch(ArrayIndexOutOfBoundsException e) { // catching array index out of bounds exception
            System.out.println("Invalid index!"); // printing error message for invalid index

        } catch(NullPointerException e) { // catching null pointer exception (if array was null)
            System.out.println("Array is not initialized!"); // printing error message for null array
        }
    }
}