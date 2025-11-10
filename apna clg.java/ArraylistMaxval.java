import java.util.ArrayList;
public class ArraylistMaxval {
    public static void main(String args[]){
        ArrayList <Integer> sanat=new ArrayList<>();
        sanat.add(2);
        sanat.add(5);
        sanat.add(9);
        sanat.add(3);
        sanat.add(6);
        int n=Integer.MIN_VALUE;
        for(int i=0;i<sanat.size();i++){
            // if(sanat.get(i)>=n){
            //     n=sanat.get(i);
            // }
            n=Math.max(n,sanat.get(i));
            
        }
        System.out.println("maximum value is "+n);
    }
    
}
