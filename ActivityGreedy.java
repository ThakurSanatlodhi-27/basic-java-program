import java.util.*;
public class ActivityGreedy {
    public static void main(String args[]){
        int  start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        ArrayList<Integer> ans=new ArrayList<>();
        int maxAns=0;
        ans.add(0);
        maxAns=1;
        int lastend=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastend){
                maxAns++;
                ans.add(i);
                lastend=end[i];
            }

        }
        System.out.println("maxAns is = "+maxAns);
        for(int i=0;i<ans.size();i++){
            System.out.println("A "+ans.get(i)+" ");
        }
        //System.out.println();

    }
    
}
