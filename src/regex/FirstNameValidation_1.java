package regex;

import java.util.regex.Pattern;

// UC1: Validate First Name
public class FirstNameValidation_1 {

    // method to validate first name
    // rule: starts with capital and minimum 3 letters
    public static boolean validateFirstName(String firstName) {
        String pattern = "^[A-Z][a-z]{2,}$";  // regex pattern
        return Pattern.matches(pattern, firstName);
    }

    public static void main(String[] args) {

        // testing first name
        String firstName = "Nandha";

        System.out.println("First Name Valid: " + validateFirstName(firstName));
    }
}
