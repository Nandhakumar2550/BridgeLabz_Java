package javakeywords;

public class Patient {

    // Static variable shared across all patients
    static String hospitalName = "City Hospital";

    // Static variable to count total patients
    static int totalPatients = 0;

    // Instance variable for patient name
    String name;

    // Instance variable for patient age
    int age;

    // Instance variable for illness
    String ailment;

    // Final variable for patient ID (cannot be changed)
    final int patientID;

    // Constructor to initialize patient details
    Patient(String name, int age, String ailment, int patientID) {

        // Assign name
        this.name = name;

        // Assign age
        this.age = age;

        // Assign ailment
        this.ailment = ailment;

        // Assign patient ID (final)
        this.patientID = patientID;

        // Increment total patient count
        totalPatients++;
    }

    static void getTotalPatients() {

        // Static method accessing static variable
        System.out.println("Total Patients: " + totalPatients);
    }

    void display() {

        // Display hospital name (same for all)
        System.out.println("Hospital: " + hospitalName);

        // Display patient name
        System.out.println("Name: " + name);

        // Display patient ID
        System.out.println("Patient ID: " + patientID);

        // Display age
        System.out.println("Age: " + age);

        // Display ailment
        System.out.println("Ailment: " + ailment);
    }

    public static void main(String[] args) {

        // Create Patient object
        Patient p = new Patient("Nandha", 22, "Fever", 1001);

        // Check object type using instanceof
        if (p instanceof Patient) {

            // Call display method
            p.display();
        }

        // Call static method
        getTotalPatients();
    }
}