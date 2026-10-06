package LinkedListAll;

public class LinkedList {

    private class Node{

        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=next;
        }

    }

    private Node head;

    private Node addAtBeging(int data, Node head){
        Node node=new Node(data);
        node.next=head;
        return node;

    }

    public void addFirst(int data){
        head=addAtBeging(data,head);
    }
public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    System.out.println("null");
}
}
