package collections;

import java.util.*;

class Patient {

    // Name of patient
    String name;

    // Severity level (higher value = more critical)
    int severity;

    // Constructor to initialize patient details
    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriageSystem {

    public static void main(String[] args) {

        // PriorityQueue to process patients based on severity (max-heap behavior)
        PriorityQueue<Patient> pq =
                new PriorityQueue<>((a, b) -> b.severity - a.severity);

        // Add patients to queue
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        // Process patients in order of highest severity first
        while(!pq.isEmpty()) {

            // Remove and print patient with highest severity
            System.out.println(pq.poll().name);
        }
    }
}