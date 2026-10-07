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
    private Node addAtLast(int data, Node head){
        Node node=new Node(data);
        if (head==null){

            return node;
        }
        Node temp=head;

        while (temp.next!=null){
            temp=temp.next;
        }
         temp.next=node;
        return head;
    }

    public void addLast(int data){
        head=addAtLast(data,head);
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
