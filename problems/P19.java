package problems;
import topics.ListNode;

public class P19 {
    public static ListNode deleteIndex(ListNode head, int n) {
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

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        head = ListNode.reverse(head);
        head = deleteIndex(head, n);
        head = ListNode.reverse(head);
        return head;
    }

    public static void main(String[] args) {
        int[] head = {1,2,3,4,5};
        int n = 2;
        ListNode list = ListNode.createListNode(head);
        list = removeNthFromEnd(list, n);
        ListNode.printListNode(list);
    }
}
