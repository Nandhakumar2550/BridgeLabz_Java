package collections;

import java.util.*;

class Customer {
    int accNo;
    int balance;

    Customer(int accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        // HashMap for accounts
        Map<Integer, Integer> accounts = new HashMap<>();
        accounts.put(101, 5000);
        accounts.put(102, 3000);
        accounts.put(103, 7000);

        // TreeMap to sort by account number
        Map<Integer, Integer> sorted = new TreeMap<>(accounts);

        // Queue for withdrawal requests
        Queue<Integer> queue = new LinkedList<>();
        queue.add(101);
        queue.add(102);

        // processing withdrawals
        while(!queue.isEmpty()) {
            int acc = queue.remove();
            accounts.put(acc, accounts.get(acc) - 500);
        }

        // display results
        System.out.println("Accounts: " + accounts);
        System.out.println("Sorted Accounts: " + sorted);
    }
}
