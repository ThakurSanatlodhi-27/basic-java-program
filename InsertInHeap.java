import java.util.*;
public class InsertInHeap {
    static class heap{
        ArrayList<Integer> arr=new ArrayList<>();
        public  void add(int data){
            arr.add(data);
            int x=arr.size()-1;
            int par=(x-1)/2;
            while(arr.get(x)<arr.get(par)){
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

            }

        }
    }
    public static  void main(String args[]){
        heap h=new heap();
        h.add(6);
        h.add(3);
        h.add(8);
        h.add(7);
        h.add(9);
        h.add(5);
        h.print
        



    }
    
}
