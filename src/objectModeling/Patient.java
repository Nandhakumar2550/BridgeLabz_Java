package objectModeling;

// Patient class representing a patient
public class Patient {

    // Name of the patient
    String name;

    // Constructor to initialize patient name
    Patient(String name) {
        this.name = name;
    }
}

// Doctor class representing a doctor
class Doctor {

    // Name of the doctor
    String name;

    // Constructor to initialize doctor name
    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {

        // Doctor interacts with patient (association)
        System.out.println("Doctor " + name + " consults Patient " + p.name);
    }
}

// Main class
class Hospital {

    public static void main(String[] args) {

        // Create Doctor object
        Doctor d1 = new Doctor("Dr. Kumar");

        // Create Patient object
        Patient p1 = new Patient("Nandha");

        // Doctor consults patient
        d1.consult(p1);
    }
}