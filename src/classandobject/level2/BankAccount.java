package classandobject.level2;

public class BankAccount {

    // Name of the account holder
    String accountHolder;

    // Account number of the bank account
    int accountNumber;

    // Current balance in the account
    double balance;

    void deposit(double amount) {

        // Add deposited amount to current balance
        balance += amount;

        // Display deposit confirmation
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {

        // Check if sufficient balance is available
        if (balance >= amount) {

            // Deduct amount from balance
            balance -= amount;

            // Display withdrawal confirmation
            System.out.println("Withdrawn: " + amount);

        } else {

            // Show error message if balance is insufficient
            System.out.println("Insufficient Balance!");
        }
    }

    void displayBalance() {

        // Print current account balance
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        // Create BankAccount object
        BankAccount acc = new BankAccount();

        // Set account holder name
        acc.accountHolder = "Nandha";

        // Set account number
        acc.accountNumber = 12345;

        // Initialize balance
        acc.balance = 10000;

        // Deposit money
        acc.deposit(2000);

        // Withdraw money
        acc.withdraw(5000);

        // Display final balance
        acc.displayBalance();
    }
}