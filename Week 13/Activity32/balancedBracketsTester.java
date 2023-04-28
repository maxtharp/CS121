package Activity32;

public class balancedBracketsTester {
    public static void main(String[] args) {
        stackBrackets balanced = new stackBrackets();

        System.out.println(balanced.checkBalance("()"));
        System.out.println(balanced.checkBalance("(()())"));
        System.out.println(balanced.checkBalance("((((()(())))))"));
        System.out.println(balanced.checkBalance("))("));
    }
}
