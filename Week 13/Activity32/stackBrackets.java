package Activity32;
import java.util.Stack;

public class stackBrackets {
    public String checkBalance(String string) {
        Stack<Character> stack = new Stack<>();

        if (string.charAt(0) == '(') {
            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);
                if (c == '(') {
                    stack.push(c);
                } else {
                    stack.pop();
                }
            }
        }
        if (string.charAt(0) == ')') {
            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);
                if (c == ')') {
                    stack.push(c);
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            return "balanced";
        } else {
            return "unbalanced";
        }
    }
}
