package problems;

import topics.ListNode;

class P21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode head = result;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ListNode newNode = new ListNode(list1.val);
                result.next = newNode;
                result = newNode;
                list1 = list1.next;
            } else {
                ListNode newNode = new ListNode(list2.val);
                result.next = newNode;
                result = newNode;
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            ListNode newNode = new ListNode(list1.val);
            result.next = newNode;
            result = newNode;
            list1 = list1.next;
        }

        while (list2 != null) {
            ListNode newNode = new ListNode(list2.val);
            result.next = newNode;
            result = newNode;
            list2 = list2.next;
        }

        return head.next;
    }

    public static void main(String[] args) {
        int[] list1 = { 1, 2, 4 }, list2 = { 1, 3, 4 };
        ListNode l1 = ListNode.createListNode(list1);
        ListNode l2 = ListNode.createListNode(list2);
        ListNode head = mergeTwoLists(l1, l2);
        ListNode.printListNode(head);
    }
}