package regex;

import java.util.regex.Pattern;

// UC6: Password Rule2
public class PasswordRule2_6 {

    // rule: at least one uppercase letter
    static boolean validatePassword(String password) {
        String pattern = ".*[A-Z].*";
        return Pattern.matches(pattern, password);
    }

    public static void main(String[] args) {

        String password = "Pass@123";

        System.out.println("Rule2 Valid: " + validatePassword(password));
    }
}
