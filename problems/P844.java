import java.util.Stack;

public class P844 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!stk1.isEmpty()) {
                    stk1.pop();
                }
            } else {
                stk1.push(s.charAt(i));
            }
        }
        s = "";
        while (!stk1.isEmpty()) {
            s += stk1.pop();
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!stk1.isEmpty()) {
                    stk1.pop();
                }
            } else {
                stk1.push(t.charAt(i));
            }
        }
        t = "";
        while (!stk1.isEmpty()) {
            t += stk1.pop();
        }
        if (s.equals(t)) {
            return true;
        }
        return false;
    }
}
