import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P3834 {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> stk = new Stack<>();
        for (int x : nums) {
            long curr = x;
            while (!stk.isEmpty() && stk.peek() == curr) {
                curr += stk.pop();
            }
            stk.push(curr);
        }
        return new ArrayList<>(stk);
    }
}
