public class NumberCheckerTaskTwo {

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

    // Standard definition: A duck number contains a '0'
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {
        int count = digits.length;
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], count);
        }
        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int testNumber = 153;
        System.out.println("--- Task 2 Analysis for Number: " + testNumber + " ---");
        
        int count = countDigits(testNumber);
        int[] digits = storeDigits(testNumber);
        
        System.out.println("Digit Count: " + count);
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(testNumber, digits));
        
        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);
        
        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
