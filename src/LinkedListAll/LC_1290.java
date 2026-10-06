package LinkedListAll;

import java.util.ArrayList;

   class ListNodee {
      int val;
      ListNodee next;
      ListNodee() {}
      ListNodee(int val) { this.val = val; }
      ListNodee(int val, ListNodee next) { this.val = val; this.next = next; }
  }

public class LC_1290 {
    public int getDecimalValue(ListNodee head) {
        ArrayList<Integer>al=new ArrayList<>();
        while(head!=null){
            al.add(head.val);
            head=head.next;

        }
        int res=0;
        int x=1;
        int num=al.size()-1;
        while(num>=0){
            int val=al.get(num);
            res+=(val*x);
            x=x+x;
            num--;
        }
        return res;
    }

    static void main() {

    }
}
