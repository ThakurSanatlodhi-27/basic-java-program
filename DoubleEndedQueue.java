import java.util.*;
public class DoubleEndedQueue {
    public static void main(String args[]){
        Deque <Integer> q=new LinkedList<>();
        q.addFirst(5);
        q.addFirst(6);
        System.out.println(q);
        q.addLast(3);
        q.addLast(8);
        System.out.println(q);
        q.removeFirst();
        System.out.println(q);
        q.removeLast();
        System.out.println(q);
        System.out.println("first element is = "+q.getFirst());
        System.out.println("last element is = "+q.getLast());
    }
    
}
