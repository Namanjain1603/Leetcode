import java.util.Stack;
import topics.*;

public class P445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        while (l1 != null) {
            stk1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stk2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode result = null;
        while (!stk1.empty() || !stk2.empty() || carry != 0) {
            int sum = carry;
            if (!stk1.empty()) {
                sum += stk1.pop();
            }
            if (!stk2.empty()) {
                sum += stk2.pop();
            }
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            node.next = result;
            result = node;
        }
        return result;
    }
}
