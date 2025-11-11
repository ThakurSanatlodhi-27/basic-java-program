import java.util.*;
import java.util.PriorityQueue;
public class PriorityQ {
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(8);
        pq.add(5);
        pq.add(45);
        pq.add(3);
        pq.add(1);
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
        System.out.println();
        PriorityQueue<String> pq1=new PriorityQueue<>(Comparator.reverseOrder());
        pq1.add("sanat");
        pq1.add("rohan");
        pq1.add("aadhe");
        pq1.add("dohan");
        while(!pq1.isEmpty()){
            System.out.print(pq1.peek()+" ");
            pq1.remove();
        }
    }
    
}
