import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class ArraylistSort {
    public static void main(String args[]){
        ArrayList<Integer> sanat=new ArrayList<>();
        sanat.add(56);
        sanat.add(46);
        sanat.add(76); 
        sanat.add(3); 
        sanat.add(23); 
        sanat.add(12); 
        sanat.add(78); 
        sanat.add(92);
    System.out.println(sanat);
    Collections.sort(sanat);
    System.out.println(sanat);

    Collections.sort(sanat,Collections.reverseOrder());
    System.out.println(sanat);
        
        
        
    }
    
}
