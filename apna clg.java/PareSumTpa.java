import java.util.ArrayList;
public class PareSumTpa {
    public static boolean pareSum(ArrayList<Integer> sanat,int target){
        int lp=0;
        int rp=sanat.size()-1;
        //int sum=sanat.get(lp)+sanat.get(rp);
        while(lp!=rp){
            int sum=sanat.get(lp)+sanat.get(rp);
            if(sum==target){
                return true;
            }else if(sum<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> sanat=new ArrayList<>();
        int target=8;
        sanat.add(1);
        sanat.add(2);
        sanat.add(3);
        sanat.add(4);
        sanat.add(5);
        sanat.add(6);
        System.out.println(pareSum(sanat,target));
    }

    
}
