public class P143 {
    public static ListNode reverse(ListNode head) {
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

    public void reorderList(ListNode head) {
        ListNode curr = head;
        ListNode forw = head.next;
        if (curr.next == null) {
            return;
        }
        forw = reverse(forw);
        curr.next = forw;
        curr = curr.next;
        reorderList(curr);
    }
}
