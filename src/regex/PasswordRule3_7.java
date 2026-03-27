package regex;

import java.util.regex.Pattern;

// UC7: Password Rule3
public class PasswordRule3_7 {

    // rule: at least one numeric value
    static boolean validatePassword(String password) {
        String pattern = ".*[0-9].*";
        return Pattern.matches(pattern, password);
    }

    public static void main(String[] args) {

        String password = "Pass@123";

        System.out.println("Rule3 Valid: " + validatePassword(password));
    }
}
