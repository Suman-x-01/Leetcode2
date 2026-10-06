package gfg;

//https://www.geeksforgeeks.org/problems/print-linked-list-elements/1

import java.util.ArrayList;
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
public class PrintLinkedList {
    public static ArrayList<Integer> printList(Node head) {

            ArrayList<Integer>al=new ArrayList<>();
            while(head!=null){
                al.add(head.data);
                head=head.next;
            }
            return al;
        }

    static void main() {
    }
}
