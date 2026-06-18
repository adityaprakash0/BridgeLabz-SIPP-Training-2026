import java.util.Scanner;

public class ShortestLongestWord {
    
    public static String[] splitText(String text) {
        return text.split(" "); // Using built-in for brevity, though custom can be used [cite: 238]
    }

    public static int getCustomLength(String text) {
        int count = 0;
        try {
            while (true) { text.charAt(count); count++; }
        } catch (Exception e) { return count; }
    }

    public static String[][] getWordData(String[] words) {
        String[][] wordData = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordData[i][0] = words[i];
            wordData[i][1] = String.valueOf(getCustomLength(words[i])); [cite: 241]
        }
        return wordData;
    }

    // Find shortest and longest indices [cite: 242]
    public static int[] findShortestLongest(String[][] wordData) {
        int shortestIndex = 0;
        int longestIndex = 0;
        
        for (int i = 1; i < wordData.length; i++) {
            int currentLength = Integer.parseInt(wordData[i][1]);
            int shortestLength = Integer.parseInt(wordData[shortestIndex][1]);
            int longestLength = Integer.parseInt(wordData[longestIndex][1]);
            
            if (currentLength < shortestLength) shortestIndex = i;
            if (currentLength > longestLength) longestIndex = i;
        }
        return new int[]{shortestIndex, longestIndex}; [cite: 243]
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = input.nextLine(); [cite: 237]

        if (text.trim().isEmpty()) {
            System.err.println("Text is empty.");
            return;
        }

        String[] words = splitText(text);
        String[][] wordData = getWordData(words);
        int[] indices = findShortestLongest(wordData); [cite: 244]

        System.out.println("\n--- Results ---");
        System.out.println("Shortest Word: " + wordData[indices[0]][0] + " (Length: " + wordData[indices[0]][1] + ")");
        System.out.println("Longest Word: " + wordData[indices[1]][0] + " (Length: " + wordData[indices[1]][1] + ")");

        input.close();
    }
}