import java.util.ArrayList;
public class ArraylistSize {
    public static void main(String args[]){
        ArrayList<Integer> sanat=new ArrayList<>();
        sanat.add(56);
        sanat.add(25);
        sanat.add(98);
        sanat.add(65);
        sanat.add(21);
        sanat.remove(3);
        System.out.println(sanat.size());

        for(int i=0;i<sanat.size();i++){
            System.out.print(sanat.get(i)+" ");
        }
        System.out.println();
        for(int i=sanat.size()-1;i>=0;i--){
            System.out.print(sanat.get(i)+" ");
        }
    }

    
}
