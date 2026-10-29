package LinkedListAll;

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LC_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null || head.next==null||k==0){
            return head;
        }
        int len=1;
         ListNode temp=head;
         while (temp.next!=null){
             temp=temp.next;
             len++;
         }

         k=k%len;

         if (k==0){
             return head;
         }

         temp.next=head;
        int steps = len - k;
        ListNode newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
