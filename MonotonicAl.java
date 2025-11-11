import java.util.*;
public class MonotonicAl {
    public static boolean monotonic(ArrayList<Integer> sanat){
        boolean increas=true;
        boolean decreas=true;
        for(int i=1;i<sanat.size()-1;i++){
            if(sanat.get(i)<=sanat.get(i-1)){
                 increas=false;
            }
            if(sanat.get(i)>=sanat.get(i-1)){
                decreas=false;
            }
        }
        return increas || decreas;
    }
   
    public static void main(String args[]){
        ArrayList<Integer> sanat=new ArrayList<>();
        sanat.add(1);
        sanat.add(1); 
        sanat.add(2);
        sanat.add(3);
        sanat.add(5);
         
           System.out.println(monotonic(sanat));
    }
    
}
