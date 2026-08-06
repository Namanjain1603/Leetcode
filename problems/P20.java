package problems;

import java.util.Stack;

public class P20 {
    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        try {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                    stk.push(s.charAt(i));
                } else {
                    if (s.charAt(i) == ')' && stk.peek() == '(') {
                        stk.pop();
                    } else if (s.charAt(i) == ']' && stk.peek() == '[') {
                        stk.pop();
                    } else if (s.charAt(i) == '}' && stk.peek() == '{') {
                        stk.pop();
                    } else {
                        return false;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        if (stk.empty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}
