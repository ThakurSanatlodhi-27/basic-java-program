import java.util.*;
public class HeightOfBinarytree {
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
    public static int height(Node root){
        if(root==null){
            return 0;
        }
       int leftH=height(root.left);
       int rightH=height(root.right);
       return Math.max(leftH,rightH)+1;


    }
    public static int Countnode(Node root){
        if(root==null){
            return 0;
        }
        int countLeft=Countnode(root.left);
        int countRight=Countnode(root.right);
        return countLeft+countRight+1;
    }
    public static int sumOfNode(Node root){
        if(root==null){
            return 0;
        }
        int Lsum=sumOfNode(root.left);
        int Rsum=sumOfNode(root.right);
        return Lsum+Rsum+root.data;
    }
    public static int Diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftDiam=Diameter(root.left);
        int lefthi=height(root.left);
        int rightDiam=Diameter(root.right);
        int righthi=height(root.right);
        int self=lefthi+righthi+1;
        return Math.max(self,Math.max(leftDiam,rightDiam));
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.right=new Node(6);
        root.right.right.right=new Node(8);
       System.out.println(height(root));
       System.out.println(Countnode(root));
       System.out.println(sumOfNode(root));
       System.out.println(Diameter(root));
        

    }
    
}
