package fourpiller;
abstract class Patient{

    String name;

    Patient(String name){
        this.name=name;
    }

    abstract double calculateBill();
}

class InPatient extends Patient{

    InPatient(String name){
        super(name);
    }

    double calculateBill(){
        return 5000;
    }
}

class OutPatient extends Patient{

    OutPatient(String name){
        super(name);
    }

    double calculateBill(){
        return 500;
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args){

        Patient p1=new InPatient("Nandha");
        Patient p2=new OutPatient("Arun");

        System.out.println(p1.calculateBill());
        System.out.println(p2.calculateBill());
    }
}
