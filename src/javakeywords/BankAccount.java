package javakeywords;

public class BankAccount {

    // Static variable shared by all objects (common bank name)
    static String bankName = "State Bank";

    // Static variable to count total accounts created
    static int totalAccounts = 0;

    // Instance variable for account holder name
    String accountHolderName;

    // Final variable (cannot be changed once assigned)
    final int accountNumber;

    // Constructor to initialize account details
    BankAccount(String accountHolderName, int accountNumber) {

        // 'this' refers to current object
        this.accountHolderName = accountHolderName;

        // Assign account number (final variable)
        this.accountNumber = accountNumber;

        // Increment total accounts count
        totalAccounts++;
    }

    void display() {

        // Display static variable (same for all objects)
        System.out.println("Bank Name: " + bankName);

        // Display account holder name
        System.out.println("Account Holder: " + accountHolderName);

        // Display account number
        System.out.println("Account Number: " + accountNumber);
    }

    static void getTotalAccounts() {

        // Static method can access only static variables directly
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {

        // Create first account object
        BankAccount acc1 = new BankAccount("Nandha", 101);

        // Create second account object
        BankAccount acc2 = new BankAccount("Kumar", 102);

        // instanceof checks object type at runtime
        if (acc1 instanceof BankAccount) {

            // Call display method
            acc1.display();
        }

        // Call static method using class name (recommended)
        getTotalAccounts();
    }
}