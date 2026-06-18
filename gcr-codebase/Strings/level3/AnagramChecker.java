import java.util.Scanner;

public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i)]++;
            freq2[str2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String text1 = input.next();
        System.out.print("Enter second string: ");
        String text2 = input.next();

        if (areAnagrams(text1, text2)) {
            System.out.println("The strings ARE anagrams.");
        } else {
            System.out.println("The strings ARE NOT anagrams.");
        }
        input.close();
    }
}