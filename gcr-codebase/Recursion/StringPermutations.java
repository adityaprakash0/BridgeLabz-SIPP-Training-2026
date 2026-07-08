public class StringPermutations {

    public static void generatePermutations(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        }
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remainingString = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remainingString, prefix + ch);
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        
        System.out.println("Input:\n" + input);
        System.out.println("Output:");
        generatePermutations(input, "");
    }
}
