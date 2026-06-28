public class P1290 {
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

    public int getDecimalValue(ListNode head) {
        head = reverse(head);
        int sum = 0;
        int count = 0;
        while (head != null) {
            sum = sum + head.val * (int) Math.powExact(2, count);
            count++;
            head = head.next;
        }
        return sum;
    }
}
