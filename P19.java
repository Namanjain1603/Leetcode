public class P19 {
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

    public ListNode deleteIndex(ListNode head, int n) {
        ListNode prev = new ListNode(-1, head);
        ListNode curr = head;
        int c = 1;
        if (n == 1) {
            prev.next = curr.next;
        }
        while (curr != null) {
            c++;
            if (c == n) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return prev.next;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = reverse(head);
        head = deleteIndex(head, n);
        head = reverse(head);
        return head;
    }
}
