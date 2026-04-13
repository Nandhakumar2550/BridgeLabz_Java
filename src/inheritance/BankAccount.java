package inheritance;

// Base class representing a general bank account
public class BankAccount {

    // Account number of the bank account
    int accountNumber;

    // Balance available in the account
    double balance;
}

// SavingsAccount class inheriting BankAccount
class SavingsAccount extends BankAccount {

    // Interest rate for savings account
    double interestRate;

    void displayAccountType() {

        // Display account type
        System.out.println("Savings Account");
    }
}

// CheckingAccount class inheriting BankAccount
class CheckingAccount extends BankAccount {

    // Withdrawal limit for checking account
    double withdrawalLimit;

    void displayAccountType() {

        // Display account type
        System.out.println("Checking Account");
    }
}

// FixedDepositAccount class inheriting BankAccount
class FixedDepositAccount extends BankAccount {

    // Tenure of fixed deposit (in months/years)
    int tenure;

    void displayAccountType() {

        // Display account type
        System.out.println("Fixed Deposit Account");
    }
}