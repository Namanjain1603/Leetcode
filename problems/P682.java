import java.util.Stack;

public class P682 {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b);
                stk.push(a);
                stk.push(a + b);
            } else if (operations[i].equals("D")) {
                int a = stk.pop();
                stk.push(a);
                stk.push(2 * a);
            } else if (operations[i].equals("C")) {
                stk.pop();
            } else {
                stk.push(Integer.parseInt(operations[i]));
            }
        }
        while (!stk.empty()) {
            sum += stk.pop();
        }
        return sum;
    }
}
