package regex;

import java.util.regex.Pattern;

// UC9: Validate All Inputs
public class UserRegistration_9 {

    static boolean firstName(String s) {
        return Pattern.matches("^[A-Z][a-z]{2,}$", s);
    }

    static boolean lastName(String s) {
        return Pattern.matches("^[A-Z][a-z]{2,}$", s);
    }

    static boolean email(String s) {
        return Pattern.matches("^[a-zA-Z]+(\\.[a-zA-Z]+)?@[a-zA-Z]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2})?$", s);
    }

    static boolean mobile(String s) {
        return Pattern.matches("^[0-9]{2} [0-9]{10}$", s);
    }

    // combining all password rules
    static boolean password(String p) {
        return p.matches(".{8,}") &&
                p.matches(".*[A-Z].*") &&
                p.matches(".*[0-9].*") &&
                p.matches("^[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$");
    }

    public static void main(String[] args) {

        String password = "Pass@123";

        System.out.println(firstName("Nandha"));
        System.out.println(lastName("Kumar"));
        System.out.println(email("abc.xyz@bl.co.in"));
        System.out.println(mobile("91 9919819801"));
        System.out.println(password(password));
    }
}
