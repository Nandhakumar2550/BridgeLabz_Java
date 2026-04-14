package collections;

import java.util.*;

class Customer {

    // Account number of customer
    int accNo;

    // Balance in account
    int balance;

    // Constructor to initialize customer details
    Customer(int accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        // HashMap to store account number → balance
        Map<Integer, Integer> accounts = new HashMap<>();

        // Add account details
        accounts.put(101, 5000);
        accounts.put(102, 3000);
        accounts.put(103, 7000);

        // TreeMap to sort accounts based on account number
        Map<Integer, Integer> sorted = new TreeMap<>(accounts);

        // Queue to handle withdrawal requests (FIFO order)
        Queue<Integer> queue = new LinkedList<>();

        // Add account numbers to withdrawal queue
        queue.add(101);
        queue.add(102);

        // Process withdrawal requests
        while(!queue.isEmpty()) {

            // Remove account from front of queue
            int acc = queue.remove();

            // Deduct 500 from the account balance
            accounts.put(acc, accounts.get(acc) - 500);
        }

        // Display updated account balances
        System.out.println("Accounts: " + accounts);

        // Display sorted accounts
        System.out.println("Sorted Accounts: " + sorted);
    }
}