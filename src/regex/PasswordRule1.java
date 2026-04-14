package regex;

import java.util.regex.Pattern;

// UC5: Password Rule1
public class PasswordRule1 {

    // rule: minimum 8 characters
    static boolean validatePassword(String password) {
        String pattern = ".{8,}";
        return Pattern.matches(pattern, password);
    }

    public static void main(String[] args) {

        String password = "Pass@123";

        System.out.println("Rule1 Valid: " + validatePassword(password));
    }
}
