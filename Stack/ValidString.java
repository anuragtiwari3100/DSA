import java.util.*;

public class ValidString {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                // Opening
                s.push(ch);
            } else {
                // Closing
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') //()
                || (s.peek() == '{' && ch == '}')  //{}
                || (s.peek() == '[' && ch == ']')) { //[]
                    // Matched, pop the opening bracket
                    s.pop();
                } else {
                    // Mismatch
                    return false;
                }
            }
        }
        // Check if there are any remaining brackets in the stack
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({})[]"; // true
        System.out.println(isValid(str));
    }
}

 