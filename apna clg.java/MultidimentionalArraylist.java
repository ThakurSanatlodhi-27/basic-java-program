import java.util.*;
public class MultidimentionalArraylist {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> sanat=new ArrayList<>();

        ArrayList<Integer> sanat1=new ArrayList<>();
        sanat1.add(1);sanat1.add(2);sanat1.add(3);sanat1.add(4);sanat1.add(5);

       ArrayList<Integer> sanat2=new ArrayList<>(); 
       sanat2.add(2);sanat2.add(4);sanat2.add(6);sanat2.add(8);sanat2.add(10);

       ArrayList<Integer> sanat3=new ArrayList<>();
       sanat3.add(3);sanat3.add(6);sanat3.add(9);sanat3.add(12);sanat3.add(15);

       ArrayList<ArrayList> ritik=new ArrayList<>();

       ArrayList<String> ritik1=new ArrayList<>();
       ritik1.add("first");ritik1.add("second");ritik1.add("third");ritik1.add("fourth");ritik1.add("fifth");

       ArrayList<Character> ritik2=new ArrayList<>();
       ritik2.add('s');ritik2.add('a');ritik2.add('n');ritik2.add('a');ritik2.add('t');

       sanat.add(sanat1);
       sanat.add(sanat2);
       sanat.add(sanat3);
       
       System.out.println(sanat);

       ritik.add(ritik1);
       ritik.add(ritik2);
       ritik.add(sanat1);
       ritik.add(sanat2);
       ritik.add(sanat3);
       System.out.println(ritik);

       for(int i=0;i<sanat.size();i++){
        ArrayList<Integer> curr=sanat.get(i);
        for(int j=0;j<curr.size();j++){
            System.out.print(curr.get(j)+" ");
        }
        System.out.println();
       }
       for(int i=0;i<ritik.size();i++){
        ArrayList<Integer> curr=ritik.get(i);
        for(int j=0;j<curr.size();j++){
            System.out.print(curr.get(j)+" ");
        }
        System.out.println();
       }

    }
    
}
