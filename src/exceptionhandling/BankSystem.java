package exceptionhandling;

// custom exception
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

// bank class
class BankAccount {
    double balance = 5000;

    // withdraw method
    void withdraw(double amount) throws InsufficientBalanceException {

        if(amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        if(amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;

        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

// main class
public class BankSystem {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        try {
            acc.withdraw(6000);

        } catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
