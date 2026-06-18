import java.util.Scanner;

public class VowelConsonantTable {

    // Helper to determine type [cite: 255]
    public static String checkCharacterType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char) (c + 32); [cite: 257]
        
        if (c < 'a' || c > 'z') return "Not a Letter"; [cite: 258]
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel"; [cite: 258]
        return "Consonant"; [cite: 258]
    }

    // Return 2D array [cite: 259]
    public static String[][] getCharacterTypes2D(String text) {
        String[][] charData = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            charData[i][0] = String.valueOf(text.charAt(i));
            charData[i][1] = checkCharacterType(text.charAt(i));
        }
        return charData; [cite: 259]
    }

    // Display tabular format [cite: 260]
    public static void displayTable(String[][] data) {
        System.out.println("\n--- Character Analysis ---");
        System.out.printf("%-10s | %-15s%n", "Character", "Type");
        System.out.println("-----------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s | %-15s%n", data[i][0], data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String[][] data = getCharacterTypes2D(text);
        displayTable(data); [cite: 261]

        input.close();
    }
}