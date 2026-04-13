package objectModeling;

// Bank class representing a bank entity
public class Bank {

    // Name of the bank
    String bankName;

    // Constructor to initialize bank name
    Bank(String bankName) {

        // Assign bank name
        this.bankName = bankName;
    }

    void openAccount(Customer c) {

        // Display message when a customer opens an account
        System.out.println(c.name + " opened an account in " + bankName);
    }
}

// Customer class representing a bank customer
class Customer {

    // Customer name
    String name;

    // Customer account balance
    double balance;

    // Constructor to initialize customer details
    Customer(String name, double balance) {

        // Assign name
        this.name = name;

        // Assign balance
        this.balance = balance;
    }

    void viewBalance() {

        // Display customer balance
        System.out.println(name + " Balance: " + balance);
    }

    public static void main(String[] args) {

        // Create Bank object
        Bank bank = new Bank("SBI");

        // Create Customer object
        Customer c1 = new Customer("Nandha", 10000);

        // Customer opens account in bank
        bank.openAccount(c1);

        // Customer views balance
        c1.viewBalance();
    }
}