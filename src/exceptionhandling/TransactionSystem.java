package exceptionhandling;

// custom exception
class TransactionException extends Exception {
    TransactionException(String msg) { // constructor to accept error message
        super(msg); // passing message to parent Exception class
    }
}

// transaction processing
public class TransactionSystem {

    static void processTransaction(double amount) throws TransactionException { // method may throw custom exception

        try {
            if(amount < 0) { // checking if amount is negative
                throw new Exception("Invalid amount"); // throwing general exception
            }

            System.out.println("Transaction successful"); // printing success message

        } catch(Exception e) {
            // rethrowing with custom message
            throw new TransactionException("Transaction failed: " + e.getMessage()); // wrapping and rethrowing
        }
    }

    public static void main(String[] args) {

        try {
            processTransaction(-100); // calling method with invalid amount

        } catch(TransactionException e) {
            System.out.println(e.getMessage()); // handling custom exception
        }
    }
}