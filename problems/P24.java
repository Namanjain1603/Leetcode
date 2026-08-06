package problems;

import topics.ListNode;

public class P24 {
    public static ListNode swapPairs(ListNode head) {
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

    public static void main(String[] args) {
        int[] head = { 1, 2, 3, 4 };
        ListNode list = ListNode.createListNode(head);
        list = swapPairs(list);
        ListNode.printListNode(list);
    }
}
