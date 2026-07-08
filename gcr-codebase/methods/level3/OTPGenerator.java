public class OTPGenerator {

    public static int generateOTP() {
        // Generates a 6-digit number (100000 to 999999)
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean isArrayUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int totalOTPs = 10;
        int[] otpList = new int[totalOTPs];

        for (int i = 0; i < totalOTPs; i++) {
            otpList[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otpList[i]);
        }

        if (isArrayUnique(otpList)) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}
