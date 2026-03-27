package exceptionhandling;

// division with rethrow
public class RethrowExceptionProgram {

    // method to perform division
    static int performDivision(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        return a / b;
    }

    // method that rethrows exception
    static int calculate(int a, int b) {
        try {
            return performDivision(a, b);

        } catch(ArithmeticException e) {
            // adding extra message and rethrowing
            throw new ArithmeticException("Error in calculation: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        try {
            System.out.println(calculate(10, 0));

        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
