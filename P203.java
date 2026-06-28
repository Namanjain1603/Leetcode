public class P203 {
    public ListNode removeElements(ListNode head, int va) {
        if (head == null) {
            return null;
        }
        ListNode result = new ListNode(-1);
        ListNode ptr = result;
        result.next = head;
        while (head != null) {
            if (head.val == va) {
                ptr.next = head.next;
            } else {
                ptr = head;
            }
            head = head.next;
        }
        return result.next;
    }
}
