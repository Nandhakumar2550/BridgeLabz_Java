package generics;

import java.util.*; // importing utility classes like List and ArrayList

// base class for job roles
abstract class JobRole {

    // method to process resume
    void process() {
        System.out.println("Processing..."); // common processing logic
    }
}

// different job roles
class SoftwareEngineer extends JobRole {} // inherits process() method
class DataScientist extends JobRole {} // inherits process() method

// generic resume class
class Resume<T extends JobRole> {
    T role; // generic type restricted to JobRole

    // constructor
    Resume(T role) {
        this.role = role; // assigning role
    }

    // checking resume
    void check() {
        role.process(); // calling process method of specific role
    }
}

// main class
public class ResumeScreeningSystem {

    // wildcard method to process multiple roles
    static void processAll(List<? extends JobRole> list) {
        for (JobRole r : list) { // iterating through list of JobRole or its subclasses
            r.process(); // processing each role
        }
    }

    public static void main(String[] args) {

        // created resume for software engineer
        Resume<SoftwareEngineer> r = new Resume<>(new SoftwareEngineer()); // creating Resume object
        r.check(); // processing single resume

        // list for multiple roles
        List<JobRole> list = new ArrayList<>(); // creating list of JobRole
        list.add(new DataScientist()); // adding DataScientist object

        // processing all resumes
        processAll(list); // calling wildcard method
    }
}