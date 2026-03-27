package exceptionhandling;

// custom exception
class TransactionException extends Exception {
    TransactionException(String msg) {
        super(msg);
    }
}

// transaction processing
public class TransactionSystem {

    static void processTransaction(double amount) throws TransactionException {

        try {
            if(amount < 0) {
                throw new Exception("Invalid amount");
            }

            System.out.println("Transaction successful");

        } catch(Exception e) {
            // rethrowing with custom message
            throw new TransactionException("Transaction failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        try {
            processTransaction(-100);

        } catch(TransactionException e) {
            System.out.println(e.getMessage());
        }
    }
}
