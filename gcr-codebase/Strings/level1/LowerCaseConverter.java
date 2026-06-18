import java.util.Scanner;

public class LowerCaseConverter {
    // Convert to lowercase using ASCII logic
    public static String convertToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Check if uppercase letter
            if (c >= 'A' && c <= 'Z') {
                result += (char) (c + 32);
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
        System.out.print("Enter text to convert to lowercase: ");
        String text = input.nextLine();
        
        String customLower = convertToLowerCase(text);
        String builtInLower = text.toLowerCase();
        boolean isMatch = compareStrings(customLower, builtInLower);
        
        System.out.println("\nCustom Lower: " + customLower);
        System.out.println("Built-in Lower: " + builtInLower);
        System.out.println("Results match: " + isMatch);
        
        input.close();
    }
}