import java.util.*;
public class PareSumAl {
    public static boolean PareSum(ArrayList<Integer> sanat,int target){
        int bp=-1;
        for(int i=0;i<sanat.size();i++){
            if(sanat.get(i)<sanat.get(i+1)){
                bp=i;
            }
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> sanat=new ArrayList<>();
        sanat.add(11);
        sanat.add(15);
        sanat.add(6);
        sanat.add(7);
        sanat.add(8);
        sanat.add(10);
        int target=16;
    }
    
}
