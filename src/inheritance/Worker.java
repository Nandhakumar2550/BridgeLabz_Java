package inheritance;

// Interface representing worker behavior
interface Workers {

    // Method to define duties of worker
    void performDuties();
}

// Base class representing a person
class Persons {

    // Name of the person
    String name;

    // ID of the person
    int id;
}

// Chef class inheriting Persons and implementing Workers
class Chef extends Persons implements Workers {

    public void performDuties() {

        // Chef-specific duty
        System.out.println(name + " cooks food");
    }
}

// Waiter class inheriting Persons and implementing Workers
class Waiter extends Persons implements Workers {

    public void performDuties() {

        // Waiter-specific duty
        System.out.println(name + " serves customers");
    }
}

// Main class
class Worker {

    public static void main(String args[]){

        // Create Chef object
        Chef c = new Chef();
        c.name = "Ravi";

        // Create Waiter object
        Waiter w = new Waiter();
        w.name = "Arun";

        // Call duties
        c.performDuties();
        w.performDuties();
    }
}