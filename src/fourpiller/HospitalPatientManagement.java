package fourpiller;

// Abstract class representing a generic patient
abstract class Patient{

    // Patient name
    String name;

    // Constructor to initialize patient name
    Patient(String name){
        this.name = name;
    }

    // Abstract method to calculate bill (must be implemented by subclasses)
    abstract double calculateBill();
}

// In-patient class (hospital admitted patients)
class InPatient extends Patient{

    // Constructor calling parent constructor
    InPatient(String name){
        super(name);
    }

    // Bill calculation for in-patient
    double calculateBill(){

        // Fixed cost for in-patient
        return 5000;
    }
}

// Out-patient class (visit-only patients)
class OutPatient extends Patient{

    // Constructor calling parent constructor
    OutPatient(String name){
        super(name);
    }

    // Bill calculation for out-patient
    double calculateBill(){

        // Fixed cost for out-patient
        return 500;
    }
}

// Main class
public class HospitalPatientManagement {

    public static void main(String[] args){

        // Polymorphism: parent reference, child objects
        Patient p1 = new InPatient("Nandha");

        Patient p2 = new OutPatient("Arun");

        // Call overridden methods
        System.out.println(p1.calculateBill());

        System.out.println(p2.calculateBill());
    }
}