package objectModeling;

public class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer c) {
        System.out.println(c.name + " opened an account in " + bankName);
    }
}

class Customer {

    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + " Balance: " + balance);
    }

    public static void main(String[] args) {

        Bank bank = new Bank("SBI");

        Customer c1 = new Customer("Nandha", 10000);

        bank.openAccount(c1);
        c1.viewBalance();
    }
}
