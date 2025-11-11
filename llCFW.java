import java.util.LinkedList;
public class llCFW {
    public static void main(String args[]){
        LinkedList<Integer> ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(5);
        ll.addLast(9);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
    
}
