import java.util.*;
public class multidimentionalArraylist1 {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=1;i<=10;i++){
            list.add(i*1);
            list1.add(i*2);
            list2.add(i*3);
        }
        mainlist.add(list);
        mainlist.add(list1);
        mainlist.add(list2);
        System.out.println(mainlist);

        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer> curr=mainlist.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();

        }
    }
    
}
