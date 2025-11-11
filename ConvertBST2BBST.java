import java.util.*;
public class ConvertBST2BBST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void Inorder(Node root,ArrayList<Integer>convert){
        if(root==null){
            return ;
        }
        Inorder(root.left,convert);
        convert.add(root.data);
        Inorder(root.right,convert);
    }
    public static Node createBST(ArrayList<Integer> convert,int st,int end){
        if(st>end){
            return null;
        }
       
        int mid=(st+end)/2;
        Node root=new Node(convert.get(mid));
        root.left=createBST( convert,st,mid-1);
        root.right=createBST(convert,mid+1,end);
        return root;
    }

    public static Node balancedBST(Node root){
        if(root==null){
            return null;
        }
        // inorder sequence
        ArrayList<Integer> convert=new ArrayList<>();
        //balance bst
        Inorder(root,convert);
        root=createBST(convert,0,convert.size()-1);
        return root;

    }
    public static void main(String args[]){
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
        root=balancedBST(root);
        preorder(root);

    }
    
}
