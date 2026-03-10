package fourpiller;
import java.util.*;

abstract class BankAccount{

    protected double balance;

    BankAccount(double balance){
        this.balance=balance;
    }

    void deposit(double amt){
        balance+=amt;
    }

    void withdraw(double amt){
        balance-=amt;
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount{

    SavingsAccount(double bal){
        super(bal);
    }

    double calculateInterest(){
        return balance*0.05;
    }
}

class CurrentAccount extends BankAccount{

    CurrentAccount(double bal){
        super(bal);
    }

    double calculateInterest(){
        return balance*0.02;
    }
}
public class BankingSystem {
    public static void main(String[] args){

        BankAccount a1=new SavingsAccount(10000);
        BankAccount a2=new CurrentAccount(15000);

        System.out.println(a1.calculateInterest());
        System.out.println(a2.calculateInterest());
    }
}
