import java.util.*;
public class PareSumAl {
    public static boolean PareSum(ArrayList<Integer> sanat,int target){
        int bp=-1;
        int n=sanat.size();
        for(int i=0;i<sanat.size()-1;i++){
            if(sanat.get(i)>sanat.get(i+1)){
                bp=i;
                break;
            }
        }int lp = (bp + 1) % n; 
    int rp = bp;         

    while (lp != rp) {
        int sum = sanat.get(lp) + sanat.get(rp);

        if (sum == target) {
            return true;
        } else if (sum < target) {
            lp = (lp + 1) % n;
        } else {
            rp = (n + rp - 1) % n;
        }
    }
    return false;}
    public static void main(String args[]){
        ArrayList<Integer> sanat=new ArrayList<>();
        sanat.add(11);
        sanat.add(15);
        sanat.add(6);
        sanat.add(7);
        sanat.add(8);
        sanat.add(10);
        int target=16;
        System.out.println(PareSum(sanat, target));
    }
    
}
