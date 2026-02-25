package method_practice.level3;
import java.util.HashSet;
public class OTPGenerator {
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean areAllUnique(int[] otps) {

        HashSet<Integer> set = new HashSet<>();

        for (int otp : otps) {
            if (!set.add(otp))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int[] otps = new int[10];

        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (int otp : otps)
            System.out.println(otp);

        System.out.println("All OTPs Unique? " + areAllUnique(otps));
    }
}
