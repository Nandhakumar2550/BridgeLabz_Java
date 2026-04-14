package collections;

import java.util.*;

// Policy class
class Policy {

    // Unique policy number
    int policyNumber;

    // Policy holder name
    String name;

    // Expiry date (stored as String for simplicity)
    String expiryDate;

    // Type of policy (Health, Auto, etc.)
    String type;

    // Policy amount
    double amount;

    // Constructor to initialize policy details
    Policy(int policyNumber, String name, String expiryDate, String type, double amount) {
        this.policyNumber = policyNumber;
        this.name = name;
        this.expiryDate = expiryDate;
        this.type = type;
        this.amount = amount;
    }

    // Override toString() for easy display
    public String toString() {
        return policyNumber + " " + name + " " + expiryDate + " " + type;
    }
}

// main class
public class InsurancePolicySystem {

    public static void main(String[] args) {

        // HashMap for fast access (no ordering)
        Map<Integer, Policy> hashMap = new HashMap<>();

        // LinkedHashMap to maintain insertion order
        Map<Integer, Policy> linkedMap = new LinkedHashMap<>();

        // TreeMap to maintain sorted order by key (policyNumber)
        Map<Integer, Policy> treeMap = new TreeMap<>();

        // Create policy objects
        Policy p1 = new Policy(101, "Ram", "2026-04-10", "Health", 5000);
        Policy p2 = new Policy(102, "John", "2026-03-30", "Auto", 3000);
        Policy p3 = new Policy(103, "Ram", "2026-02-01", "Home", 4000);

        // Add policies to HashMap
        hashMap.put(p1.policyNumber, p1);
        hashMap.put(p2.policyNumber, p2);
        hashMap.put(p3.policyNumber, p3);

        // Copy data into LinkedHashMap (preserves insertion order)
        linkedMap.putAll(hashMap);

        // Copy data into TreeMap (sorted by key)
        treeMap.putAll(hashMap);

        // Retrieve policy using policy number
        System.out.println("Get Policy 101: " + hashMap.get(101));

        // List policies by customer name "Ram"
        for(Policy p : hashMap.values()) {

            // Check if policy belongs to Ram
            if(p.name.equals("Ram")) {

                // Print matching policies
                System.out.println("Policy of Ram: " + p);
            }
        }

        // Remove expired policies (simple string comparison)
        for(Integer key : new ArrayList<>(hashMap.keySet())) {

            // Compare expiry date with cutoff date
            if(hashMap.get(key).expiryDate.compareTo("2026-03-01") < 0) {

                // Remove expired policy
                hashMap.remove(key);
            }
        }

        // Display remaining policies
        System.out.println("Remaining Policies: " + hashMap.values());
    }
}