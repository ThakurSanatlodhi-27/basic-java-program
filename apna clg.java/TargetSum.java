import java.util.ArrayList;
public class TargetSum {
    public static boolean sum(ArrayList<Integer>sanat,int target){
        for(int i=0;i<sanat.size();i++){
            for(int j=0;j<sanat.size();j++){
                if(sanat.get(i)+sanat.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> sanat=new ArrayList<>();
        int target=6;
        sanat.add(1);
        sanat.add(2);
        sanat.add(3);
        sanat.add(4);
        //sanat.add(5);
        System.out.println(sum(sanat,target));

    }
    
}
