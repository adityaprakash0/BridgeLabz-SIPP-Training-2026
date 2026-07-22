import java.util.HashSet;
import java.util.Set;

public class DuplicateSessionToken {

    public static boolean hasDuplicateToken(String[] tokens) {
        Set<String> seen = new HashSet<>();

        for (String token : tokens) {
            if (!seen.add(token)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] tokens1 = {"A123", "B456", "C789", "A123"};
        String[] tokens2 = {"X111", "Y222", "Z333"};

        System.out.println(hasDuplicateToken(tokens1)); 
        System.out.println(hasDuplicateToken(tokens2)); 
    }
}
