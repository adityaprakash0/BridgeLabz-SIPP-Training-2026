import java.util.Scanner;

public class CustomStringTrimmer {

    // Find start and end indices without leading/trailing spaces [cite: 266]
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++; [cite: 267]
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--; [cite: 267]
        }
        return new int[]{start, end}; [cite: 268]
    }

    // Create substring [cite: 269]
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Compare strings [cite: 270]
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string with leading/trailing spaces: ");
        String text = input.nextLine();

        int[] indices = findTrimIndices(text);
        String customTrim = createSubstring(text, indices[0], indices[1]); [cite: 271]
        String builtInTrim = text.trim(); [cite: 272]

        System.out.println("\n--- Trim Results ---");
        System.out.println("Custom Trim: '" + customTrim + "'");
        System.out.println("Built-in Trim: '" + builtInTrim + "'");
        System.out.println("Match: " + compareStrings(customTrim, builtInTrim)); [cite: 272, 273]

        input.close();
    }
}