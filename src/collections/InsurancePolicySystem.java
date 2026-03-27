package collections;

import java.util.*;

// Policy class
class Policy {
    int policyNumber;
    String name;
    String expiryDate; // simple string for exam
    String type;
    double amount;

    // constructor
    Policy(int policyNumber, String name, String expiryDate, String type, double amount) {
        this.policyNumber = policyNumber;
        this.name = name;
        this.expiryDate = expiryDate;
        this.type = type;
        this.amount = amount;
    }

    public String toString() {
        return policyNumber + " " + name + " " + expiryDate + " " + type;
    }
}

// main class
public class InsurancePolicySystem {

    public static void main(String[] args) {

        // HashMap for fast access
        Map<Integer, Policy> hashMap = new HashMap<>();

        // LinkedHashMap for insertion order
        Map<Integer, Policy> linkedMap = new LinkedHashMap<>();

        // TreeMap for sorting (by policy number here for simplicity)
        Map<Integer, Policy> treeMap = new TreeMap<>();

        // adding policies
        Policy p1 = new Policy(101,"Ram","2026-04-10","Health",5000);
        Policy p2 = new Policy(102,"John","2026-03-30","Auto",3000);
        Policy p3 = new Policy(103,"Ram","2026-02-01","Home",4000);

        hashMap.put(p1.policyNumber,p1);
        hashMap.put(p2.policyNumber,p2);
        hashMap.put(p3.policyNumber,p3);

        linkedMap.putAll(hashMap);
        treeMap.putAll(hashMap);

        // retrieve by policy number
        System.out.println("Get Policy 101: " + hashMap.get(101));

        // list policies by name
        for(Policy p : hashMap.values()) {
            if(p.name.equals("Ram")) {
                System.out.println("Policy of Ram: " + p);
            }
        }

        // remove expired (simple check)
        for(Integer key : new ArrayList<>(hashMap.keySet())) {
            if(hashMap.get(key).expiryDate.compareTo("2026-03-01") < 0) {
                hashMap.remove(key);
            }
        }

        // display all
        System.out.println("Remaining Policies: " + hashMap.values());
    }
}
