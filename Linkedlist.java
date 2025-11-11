import java.util.*;
public class Linkedlist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;

        head=newnode;



    }
    public void addLast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }

    public  void print(){
        
        Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
        System.out.println("null");
    }

    public void add(int idx,int data){
        if(idx==0){
            addFirst( data);
            return;
        }
        Node newnode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;

    }

    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;

        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

        
    }
    public int itreativeSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
                
            }
            temp=temp.next;
            i++;
        }
        
        return -1;
        

    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head=prev;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        else if(head.data==key){
            //System.out.println("key is found ");
            return 0;
        }
       int indx= helper(head.next,key);
       if(indx==-1){
        return -1;
       }
       
        return indx+1;
    }
    public int recursive(int key){
        return helper(head,key);
    }
    public static void main(String args[]){
        Linkedlist ll=new Linkedlist();
        //ll.print();
        ll.addFirst(2);
        //ll.print();
        ll.addFirst(1);
        //ll.print();
        
        ll.addLast(3);
        //ll.print();
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
       System.out.println(ll. itreativeSearch(3));
       System.out.println(ll.recursive(3));
       ll.reverse();
       ll.print();
       
    

       

        

    }
    
}
