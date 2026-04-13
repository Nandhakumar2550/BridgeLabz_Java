package fourpiller;

import java.util.*;

// Abstract class representing common bank account behavior
abstract class BankAccount{

    // Protected balance accessible by subclasses
    protected double balance;

    // Constructor to initialize balance
    BankAccount(double balance){
        this.balance = balance;
    }

    void deposit(double amt){

        // Add amount to balance
        balance += amt;
    }

    void withdraw(double amt){

        // Deduct amount from balance
        balance -= amt;
    }

    // Abstract method to calculate interest (must be implemented by subclasses)
    abstract double calculateInterest();
}

// Savings account class inheriting BankAccount
class SavingsAccount extends BankAccount{

    // Constructor calling parent constructor
    SavingsAccount(double bal){
        super(bal);
    }

    // Implement interest calculation (5%)
    double calculateInterest(){
        return balance * 0.05;
    }
}

// Current account class inheriting BankAccount
class CurrentAccount extends BankAccount{

    // Constructor calling parent constructor
    CurrentAccount(double bal){
        super(bal);
    }

    // Implement interest calculation (2%)
    double calculateInterest(){
        return balance * 0.02;
    }
}

// Main class
public class BankingSystem {

    public static void main(String[] args){

        // Polymorphism: reference of parent, object of child
        BankAccount a1 = new SavingsAccount(10000);

        BankAccount a2 = new CurrentAccount(15000);

        // Call overridden methods
        System.out.println(a1.calculateInterest());

        System.out.println(a2.calculateInterest());
    }
}