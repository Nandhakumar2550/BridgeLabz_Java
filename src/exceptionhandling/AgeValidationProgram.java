package exceptionhandling;

import java.util.*; // importing utility classes like Scanner

// custom exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { // constructor that accepts error message
        super(msg); // passing message to parent Exception class
    }
}

// main class
public class AgeValidationProgram {

    // validating age
    static void validateAge(int age) throws InvalidAgeException { // method that may throw custom exception

        if(age < 18) { // checking if age is less than 18
            throw new InvalidAgeException("Age must be 18 or above"); // throwing custom exception
        }

        System.out.println("Access granted!"); // printing success message if age is valid
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // creating Scanner object for input

        try {
            int age = sc.nextInt(); // reading integer input from user

            validateAge(age); // calling validation method

        } catch(InvalidAgeException e) { // catching custom exception
            System.out.println(e.getMessage()); // printing exception message
        }
    }
}