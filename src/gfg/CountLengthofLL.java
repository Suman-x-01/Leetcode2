package gfg;
//https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1
public class CountLengthofLL {
    static void main() {

    }
    public int getCount(Node head) {
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}
