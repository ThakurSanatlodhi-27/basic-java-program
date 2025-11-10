import java.util.ArrayList;
public class ArraysList {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Float> list3=new ArrayList<>();
     // add() operation
     list.add(12);
     list.add(63);
     list.add(69);
     list.add(1,365);
     

     System.out.println(list);
     
     list3.add((float)47.25);
     list3.add(0,(float)65.23);
     System.out.println(list3);
     list2.add("sanat");
     list2.add(0,"ritik");
     list2.add(2,"shivam");
     System.out.println(list2);

     // get() operation
     int element=list.get(3);
     System.out.println(element);
     String ram=list2.get(0);
     System.out.println(ram); 

     // remove() operation
     System.out.println(list.remove(2));
     System.out.println(list2.remove(1));
     System.out.println(list3.remove(0));
     System.out.println(list);

    //set() operation
    list.set(2,23);
    System.out.println(list);

    //contains()
    System.out.println(list.contains(365));
    }
    
}
