import java.util.Stack;

public class P234 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stk = new Stack<>();
        ListNode curr = head;
        while (curr != null) {
            stk.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            int llv = curr.val;
            int stv = stk.pop();
            if (llv != stv) {
                return false;
            }
            curr = curr.next;
        }
        return true;
    }
}
