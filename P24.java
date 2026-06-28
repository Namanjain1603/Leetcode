public class P24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = new ListNode(-1, head);
        ListNode ptr = prev;
        while (head != null && head.next != null) {
            ListNode forw = head.next;
            ptr.next = forw;
            head.next = forw.next;
            forw.next = head;
            ptr = head;
            head = head.next;
        }
        return prev.next;
    }
}
