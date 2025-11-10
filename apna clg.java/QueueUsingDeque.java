import java.util.*;
public class QueueUsingDeque {
    static class QueueB{
         Deque<Integer> q=new LinkedList<>();
        
        public  void add(int data){
            q.addLast(data);
        }

        public  int remove(){
           return q.removeFirst();
        }
        
        public  int peek(){
            return q.getFirst();
        }
        

    }
    public static void main(String args[]){
        QueueB q=new QueueB();
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        System.out.println(q.peek());
        
           ;
            q.remove();
             System.out.println( q.peek());
        

    }
    
}
