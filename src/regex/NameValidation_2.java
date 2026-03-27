package regex;

import java.util.regex.Pattern;

// UC2: Validate First Name and Last Name
public class NameValidation_2 {

    // validate first name
    static boolean validateFirstName(String firstName) {
        return Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
    }

    // validate last name
    static boolean validateLastName(String lastName) {
        return Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
    }

    public static void main(String[] args) {

        String firstName = "Nandha";
        String lastName = "Kumar";

        System.out.println("First Name Valid: " + validateFirstName(firstName));
        System.out.println("Last Name Valid: " + validateLastName(lastName));
    }
}
