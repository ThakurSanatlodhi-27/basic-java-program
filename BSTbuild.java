import java.util.*;
public class BSTbuild {
    static class Node{
        int data;
        Node left;
        Node right;
         Node(int data){
           this.data=data;
             
             
        }
    }

    public static Node insert(Node root,int key){
      if(root==null){
        root=new Node(key);
        return root;
      }
      if(key<root.data){
        root.left=insert(root.left,key);
      }
      if(key>root.data){
        root.right=insert(root.right,key);
      }
      return root;
}

public static void inorder(Node root){
  if(root==null){
    return;

  }
  inorder(root.left);
  System.out.println(root.data);
  inorder(root.right);
}

public static boolean search(Node root,int key){
  if(root==null){
    return  false;
  }
  if(root.data==key){
    return true;
  }
   if(root.data<key){
    return search(root.right,key);
  }else{
    return search(root.left,key);
  }
}

public static void PrintInRange(Node root,int k1,int k2){
  if(root==null){
    return;
  }
  if(k1<=root.data &&root.data<=k2){
    PrintInRange(root.left,k1,k2);
    System.out.print(root.data+" ");
    PrintInRange(root.right,k1,k2);
  }else if(root.data<k1){
    PrintInRange(root.left,k1,k2);
  }else{
    PrintInRange(root.right,k1,k2);
  }
}

public static void PrintPath(ArrayList<Integer> path){
  for(int i=0;i<path.size();i++){
    System.out.print(path.get(i)+ "->" +" ");
  }
  System.out.println("Null");
}

public static void Root2LeafPath(Node root,ArrayList<Integer>path){
  if(root==null){
    return;
  }
  path.add(root.data);
  if(root.left==null && root.right==null){
     PrintPath(path);
  }
  
  Root2LeafPath(root.left,path);
  Root2LeafPath(root.right,path);
  path.remove(path.size()-1);

}

    public static void main(String args[]){
      int arr[]={5,1,3,4,2,7};
      Node root=null;
      for (int i=0;i<arr.length;i++){
        root=insert(root,arr[i]);
      }
      inorder(root);
      if(search(root,1)){
         System.out.println("key is found ");
       }else{
         System.out.println("key is not found");
     }
    PrintInRange(root,1,5);
    System.out.println();

    Root2LeafPath(root,new ArrayList<>());
    
    
}
}
