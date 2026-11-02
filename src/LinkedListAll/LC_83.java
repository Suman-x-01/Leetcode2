package LinkedListAll;

    class ListNode2 {
       int val;
       ListNode2 next;
       ListNode2() {}
       ListNode2(int val) { this.val = val; }
       ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
   }
 
 public class LC_83 {
    public ListNode2 deleteDuplicates(ListNode2 head) {
        ListNode2 current=head;

        while(current !=null && current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return head;
    }
}
