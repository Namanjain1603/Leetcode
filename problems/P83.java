package problems;

import topics.ListNode;

public class P83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode l = new ListNode();
        l = head;
        while (l.next != null) {
            if (l.val == l.next.val) {
                l.next = l.next.next;
            } else {
                l = l.next;
            }
        }
        return head;
    }

    public void main(String[] args) {
        int[] head = { 1, 1, 2, 3, 4, 5, 5 };
        ListNode list = ListNode.createListNode(head);
        ListNode.printListNode(deleteDuplicates(list));
    }
}
