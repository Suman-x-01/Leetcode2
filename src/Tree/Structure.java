package Tree;

import java.util.Scanner;

public class Structure {
    private class Node{
        int val;
        Node left;
        Node right;
    }

    private Node root;

    Structure(){
        root=createTree();
    }

    private Node createTree(){
        System.out.println("Enter Node : ");
        Scanner sc=new Scanner(System.in);
        int item=sc.nextInt();

        Node nn=new Node();
        nn.val=item;




        System.out.println("Node"+item+" has any left child : ");
        boolean ans=sc.nextBoolean();
        if (ans){
            nn.left=createTree();
        }

        System.out.println("Node"+item+" has any right child : ");
        boolean ans2=sc.nextBoolean();
        if (ans2){
            nn.right=createTree();
        }

        return nn;
    }
    private void Display(Node node){
        if (node==null){
            return;
        }
        String s="";
        s="< --- "+node.val+" --- >";
        if(node.left!=null){
            s=node.left.val+s;
        }else{
            s="null "+s;
        }

        if(node.right!=null){
            s=s+node.right.val;
        }else{
            s=s+" null";
        }
        System.out.println(s);
        Display(node.left);
//        System.out.println(node.val);
        Display(node.right);
    }
    public void display(){
        Display(root);
    }
}
