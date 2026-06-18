import java.util.Scanner;

public class VowelConsonantCounter {

    // Check character type [cite: 247]
    public static String checkCharacterType(char c) {
        // Convert to lowercase using ASCII [cite: 249]
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }

        if (c < 'a' || c > 'z') {
            return "Not a Letter"; [cite: 250]
        } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel"; [cite: 250]
        } else {
            return "Consonant"; [cite: 250]
        }
    }

    // Return count of vowels and consonants in array [cite: 251]
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            String type = checkCharacterType(text.charAt(i));
            if (type.equals("Vowel")) vowels++;
            else if (type.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants}; [cite: 251]
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int[] counts = countVowelsConsonants(text); [cite: 252]
        
        System.out.println("\n--- Character Counts ---");
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        input.close();
    }
}