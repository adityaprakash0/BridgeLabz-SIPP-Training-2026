import java.util.Scanner;

public class WordLengthAnalyzer {

    // Helper method to split text manually (reusing logic from Program 2) [cite: 225]
    public static String[] splitText(String text) {
        if (text.isEmpty()) return new String[0];
        int spaces = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') spaces++;
        }
        String[] words = new String[spaces + 1];
        String temp = "";
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = temp;
                temp = "";
            } else {
                temp += text.charAt(i);
            }
        }
        words[index] = temp;
        return words;
    }

    // Method to get length without length() [cite: 226]
    public static int getCustomLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Return 2D array of words and lengths [cite: 227]
    public static String[][] getWordLengths2D(String[] words) {
        String[][] wordData = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordData[i][0] = words[i];
            wordData[i][1] = String.valueOf(getCustomLength(words[i])); [cite: 228]
        }
        return wordData;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = input.nextLine(); [cite: 224]

        String[] words = splitText(text);
        String[][] wordData = getWordLengths2D(words);

        System.out.println("\n--- Word Analysis ---");
        System.out.printf("%-15s | %-10s%n", "Word", "Length");
        System.out.println("--------------------------------");
        for (int i = 0; i < wordData.length; i++) {
            int lengthAsInt = Integer.parseInt(wordData[i][1]); // Convert back to int for display [cite: 230]
            System.out.printf("%-15s | %-10d%n", wordData[i][0], lengthAsInt);
        }

        input.close();
    }
}