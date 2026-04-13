package method_practice.level3;
import java.util.HashSet;

public class OTPGenerator {

    public static int generateOTP() {

        return 100000 + (int)(Math.random() * 900000);
        // Generates a random 6-digit OTP (100000–999999)
    }

    public static boolean areAllUnique(int[] otps) {

        HashSet<Integer> set = new HashSet<>();
        // Creates HashSet to track unique OTPs

        for (int otp : otps) {

            if (!set.add(otp))
                return false;
            // If OTP already exists → not unique
        }

        return true;
        // All OTPs are unique
    }

    public static void main(String[] args) {

        int[] otps = new int[10];
        // Array to store 10 OTPs

        for (int i = 0; i < otps.length; i++) {

            otps[i] = generateOTP();
            // Generates and stores OTP
        }

        System.out.println("Generated OTPs:");
        // Prints heading

        for (int otp : otps)
            System.out.println(otp);
        // Displays all OTPs

        System.out.println("All OTPs Unique? " + areAllUnique(otps));
        // Checks and prints uniqueness result
    }
}