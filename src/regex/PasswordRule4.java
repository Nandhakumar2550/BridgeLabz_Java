package regex;

import java.util.regex.Pattern;

// UC8: Password Rule4
public class PasswordRule4 {

    // rule: exactly one special character
    static boolean validatePassword(String password) {
        String pattern = "^[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$";
        return Pattern.matches(pattern, password);
    }

    public static void main(String[] args) {

        String password = "Pass@123";

        System.out.println("Rule4 Valid: " + validatePassword(password));
    }
}