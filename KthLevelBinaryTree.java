import java.util.*;
public class KthLevelBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void Klevel(Node root,int level,int k){
        if(root==null){
            return ;
        }
        if(k==level){
            System.out.print(root.data+" ");
            return;
        }
        Klevel(root.left,level+1,k);
        Klevel(root.right,level+1,k);

    }
    public static void main(String args[]){
        Node newnode=new Node(1);
        newnode.left=new Node(2);
        newnode.left.left=new Node(7);
        newnode.left.right=new Node(4);
        newnode.right=new Node(6);
        newnode.right.left=new Node(9);
        newnode.right.right=new Node(8);
        int k=3;
        Klevel(newnode,1,k);

    }
    
}
