class P2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0); // new list, ye ek dummy node h
        ListNode head = result; // pointer
        int carry = 0;
        while (l1 != null || l2 != null) { // dono m se koi ek bhi null nhi hua to chlega
            int sum = 0 + carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum %= 10;
            result.next = new ListNode(sum); // new node bnai
            result = result.next; // new node pe shift hue
        }
        if (carry == 1) {
            result.next = new ListNode(1);
        }
        return head.next; // real node se return kra denge
    }
}