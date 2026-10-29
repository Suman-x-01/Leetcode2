package LinkedListAll;


  class ListNodes {
     int val;
     ListNodes next;
    ListNodes(int x) {
        val = x;
         next = null;
     }
 }


public class LC_141 {

    public boolean hasCycle(ListNodes head) {
        ListNodes slow=head;
        ListNodes fast=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }

        }

        return false;
    }
}
