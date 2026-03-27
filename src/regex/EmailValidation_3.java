package regex;

import java.util.regex.Pattern;

// UC3: Validate Email
public class EmailValidation_3 {

    // validate email with optional parts
    static boolean validateEmail(String email) {
        String pattern = "^[a-zA-Z]+(\\.[a-zA-Z]+)?@[a-zA-Z]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2})?$";
        return Pattern.matches(pattern, email);
    }

    public static void main(String[] args) {

        String email = "abc.xyz@bl.co.in";

        System.out.println("Email Valid: " + validateEmail(email));
    }
}
