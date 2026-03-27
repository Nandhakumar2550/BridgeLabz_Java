package exceptionhandling;

import java.util.*;

// custom exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

// main class
public class AgeValidationProgram {

    // validating age
    static void validateAge(int age) throws InvalidAgeException {

        if(age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("Access granted!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int age = sc.nextInt();

            validateAge(age);

        } catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
