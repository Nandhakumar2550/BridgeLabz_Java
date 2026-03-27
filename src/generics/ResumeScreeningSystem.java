package generics;

import java.util.*;

// base class for job roles
abstract class JobRole {

    // method to process resume
    void process() {
        System.out.println("Processing...");
    }
}

// different job roles
class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}

// generic resume class
class Resume<T extends JobRole> {
    T role;

    // constructor
    Resume(T role) {
        this.role = role;
    }

    // checking resume
    void check() {
        role.process();
    }
}

// main class
public class ResumeScreeningSystem {

    // wildcard method to process multiple roles
    static void processAll(List<? extends JobRole> list) {
        for (JobRole r : list) {
            r.process();
        }
    }

    public static void main(String[] args) {

        // created resume for software engineer
        Resume<SoftwareEngineer> r = new Resume<>(new SoftwareEngineer());
        r.check();

        // list for multiple roles
        List<JobRole> list = new ArrayList<>();
        list.add(new DataScientist());

        // processing all resumes
        processAll(list);
    }
}
