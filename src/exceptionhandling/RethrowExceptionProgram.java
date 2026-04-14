package exceptionhandling;

// division with rethrow
public class RethrowExceptionProgram {

    // method to perform division
    static int performDivision(int a, int b) {
        if(b == 0) { // checking if denominator is zero
            throw new ArithmeticException("Denominator cannot be zero"); // throwing exception
        }
        return a / b; // performing division
    }

    // method that rethrows exception
    static int calculate(int a, int b) {
        try {
            return performDivision(a, b); // calling division method

        } catch(ArithmeticException e) {
            // adding extra message and rethrowing
            throw new ArithmeticException("Error in calculation: " + e.getMessage()); // rethrowing with new message
        }
    }

    public static void main(String[] args) {

        try {
            System.out.println(calculate(10, 0)); // calling method with invalid input

        } catch(ArithmeticException e) {
            System.out.println(e.getMessage()); // handling rethrown exception
        }
    }
}