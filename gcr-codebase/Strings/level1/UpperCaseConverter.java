import java.util.Scanner;

public class UpperCaseConverter {
    // Convert to uppercase using ASCII logic
    public static String convertToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Check if lowercase letter
            if (c >= 'a' && c <= 'z') {
                result += (char) (c - 32); 
            } else {
                result += c;
            }
        }
        return result;
    }

    // Compare two strings manually
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text to convert to uppercase: ");
        String text = input.nextLine();
        
        String customUpper = convertToUpperCase(text);
        String builtInUpper = text.toUpperCase();
        boolean isMatch = compareStrings(customUpper, builtInUpper);
        
        System.out.println("\nCustom Upper: " + customUpper);
        System.out.println("Built-in Upper: " + builtInUpper);
        System.out.println("Results match: " + isMatch);
        
        input.close();
    }
}