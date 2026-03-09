package objectModeling;

public class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {

    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println("Doctor " + name + " consults Patient " + p.name);
    }
}

class Hospital {

    public static void main(String[] args) {

        Doctor d1 = new Doctor("Dr. Kumar");
        Patient p1 = new Patient("Nandha");

        d1.consult(p1);
    }
}
