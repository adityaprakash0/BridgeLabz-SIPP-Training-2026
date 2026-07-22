import java.util.Stack;

public class BalancedBrackets {

    public static boolean isValidConfig(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s1 = "{[()]}";
        String s2 = "{[(])}";
        String s3 = "((()))";
        String s4 = "{[()]";
        String s5 = "";

        System.out.println(s1 + " -> " + isValidConfig(s1));
        System.out.println(s2 + " -> " + isValidConfig(s2));
        System.out.println(s3 + " -> " + isValidConfig(s3));
        System.out.println(s4 + " -> " + isValidConfig(s4));
        System.out.println(s5 + " -> " + isValidConfig(s5));
    }
}
