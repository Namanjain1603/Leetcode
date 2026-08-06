package topics;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // Reverse Linked List
    public static ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        prev.next = null;
        while (curr != null) {
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }

    // Print Linked List
    public static void printListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }

    }

    // Create Linked List
    public static ListNode createListNode(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for (int i : arr) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return dummy.next;
    }
}
