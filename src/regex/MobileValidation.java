package regex;

import java.util.regex.Pattern;

// UC4: Validate Mobile Number
public class MobileValidation {

    // rule: country code + space + 10 digit number
    static boolean validateMobile(String mobile) {
        String pattern = "^[0-9]{2} [0-9]{10}$";
        return Pattern.matches(pattern, mobile);
    }

    public static void main(String[] args) {

        String mobile = "91 9919819801";

        System.out.println("Mobile Valid: " + validateMobile(mobile));
    }
}