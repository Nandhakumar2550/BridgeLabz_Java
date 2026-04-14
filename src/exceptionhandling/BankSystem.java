package exceptionhandling;

// custom exception
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) { // constructor to accept error message
        super(msg); // passing message to parent Exception class
    }
}

// bank class
class BankAccount {
    double balance = 5000; // initializing account balance

    // withdraw method
    void withdraw(double amount) throws InsufficientBalanceException { // method may throw custom exception

        if(amount < 0) { // checking if amount is negative
            throw new IllegalArgumentException("Invalid amount!"); // throwing built-in exception
        }

        if(amount > balance) { // checking if withdrawal exceeds balance
            throw new InsufficientBalanceException("Insufficient balance!"); // throwing custom exception
        }

        balance -= amount; // deducting amount from balance

        System.out.println("Withdrawal successful, new balance: " + balance); // printing updated balance
    }
}

// main class
public class BankSystem {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(); // creating BankAccount object

        try {
            acc.withdraw(6000); // attempting to withdraw more than balance

        } catch(InsufficientBalanceException e) { // catching custom exception
            System.out.println(e.getMessage()); // printing custom exception message

        } catch(IllegalArgumentException e) { // catching invalid argument exception
            System.out.println(e.getMessage()); // printing error message
        }
    }
}