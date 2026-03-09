package javakeywords;

public class BankAccount {
    static String bankName = "State Bank";
    static int totalAccounts = 0;

    String accountHolderName;
    final int accountNumber;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    void display() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Nandha", 101);
        BankAccount acc2 = new BankAccount("Kumar", 102);

        if (acc1 instanceof BankAccount) {
            acc1.display();
        }

        getTotalAccounts();
    }
}
