public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode reverse(ListNode head){
        if(head == null){
            return null;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        prev.next=null;
        while(curr != null){
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }

    public void printListNode(ListNode head){
        while(head!=null){
            System.out.print(head.val+" -> ");
            head = head.next;
        }
        
    }
    public void main(String[] args) {
        ListNode l5 = new ListNode(50,null);
        ListNode l4 = new ListNode(40,l5);
        ListNode l3 = new ListNode(30,l4);
        ListNode l2 = new ListNode(20,l3);
        ListNode l1 = new ListNode(10,l2);
        ListNode head = l1;
        head = reverse(head);
        printListNode(head);
    }
}
