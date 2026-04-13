package inheritance;

// Base class representing a general course
public class Course {

    // Name of the course
    String courseName;

    // Duration of the course (in hours/days)
    int duration;
}

// OnlineCourse class inheriting Course
class OnlineCourse extends Course {

    // Platform where course is hosted (e.g., Udemy, Coursera)
    String platform;

    // Indicates whether the course is recorded or live
    boolean isRecorded;
}

// PaidOnlineCourse class inheriting OnlineCourse
class PaidOnlineCourse extends OnlineCourse {

    // Fee for the course
    double fee;

    // Discount on the course fee
    double discount;
}