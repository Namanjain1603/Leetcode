class P21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
}