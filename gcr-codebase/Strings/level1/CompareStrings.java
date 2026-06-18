import java.util.Scanner;

public class CompareStrings {
    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String text1 = input.next();
        
        System.out.print("Enter the second string: ");
        String text2 = input.next();
        
        boolean customResult = compareUsingCharAt(text1, text2);
        boolean builtInResult = text1.equals(text2);
        
        System.out.println("\n--- Comparison Results ---");
        System.out.println("Custom charAt() Match: " + customResult);
        System.out.println("Built-in equals() Match: " + builtInResult);
        
        input.close();
    }
}