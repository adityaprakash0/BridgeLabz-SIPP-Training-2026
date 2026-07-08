public class NumberCheckerTaskFour {

    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] originalDigits = storeDigits(number);
        int[] reversedDigits = reverseDigitsArray(originalDigits);
        return compareArrays(originalDigits, reversedDigits);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int testNumber = 1221;
        System.out.println("--- Task 4 Analysis for Number: " + testNumber + " ---");
        
        int[] original = storeDigits(testNumber);
        int[] reversed = reverseDigitsArray(original);
        
        System.out.print("Reversed Array: ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
        System.out.println();
        
        System.out.println("Is Palindrome? " + isPalindrome(testNumber));
        System.out.println("Is Duck Number? " + isDuckNumber(original));
    }
}
