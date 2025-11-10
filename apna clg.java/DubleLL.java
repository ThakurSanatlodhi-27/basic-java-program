public class DubleLL{
    public class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
        
    }
    public static Node head;
    public static Node tail;
    public static int size; 
    
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        newNode.next=null;
        newNode.prev=tail;
        tail=newNode;
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;

        }else{
            int val=head.data;
            head=head.next;
            head.prev=null;
            size--;
            return val;
        }
    }
    public int removeLast(){
        if(head==null){
            System.out.println("ll is empthy");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=tail.data;
            head=tail=null;
            size--;
            return val;
        }
        else{
            int val=tail.data;
            tail=tail.prev;
            tail.next=null;
            size--;
            return val;

        }
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String args[]){
        DubleLL dll=new DubleLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.addLast(6);
        dll.addLast(7);
        dll.addLast(8);
        dll.addLast(9);
        dll.addLast(10);
        dll.print();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.removeFirst();
        dll.print();
        System.out.println(size);
        dll.removeLast();
        dll.removeLast();
        dll.print();
        System.out.println(size);
        dll.reverse();
        dll.print();
    }
}