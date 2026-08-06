import topics.*;

public class P2816 {
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);
        ListNode ptr = head;
        int carry = 0;
        ListNode prev = null;
        while (ptr != null) {
            int sum = carry + ptr.val * 2;
            ptr.val = sum % 10;
            carry = sum / 10;
            prev = ptr;
            ptr = ptr.next;
        }
        if (carry == 1) {
            prev.next = new ListNode(1);
        }
        head = reverse(head);
        return head;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
}
