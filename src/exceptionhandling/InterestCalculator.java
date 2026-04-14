package exceptionhandling;

// interest calculation
public class InterestCalculator {

    // method with throws
    static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException { // method may throw exception

        // checking invalid input
        if(amount < 0 || rate < 0) { // validating that amount and rate are non-negative
            throw new IllegalArgumentException("Invalid input"); // throwing exception for invalid values
        }

        return (amount * rate * years) / 100; // calculating simple interest
    }

    public static void main(String[] args) {

        try {
            double result = calculateInterest(1000, 5, 2); // calling method with valid inputs

            System.out.println("Interest: " + result); // printing calculated interest

        } catch(IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive"); // handling invalid input exception
        }
    }
}