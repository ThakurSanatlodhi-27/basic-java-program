import java.util.*;
public class strinbuld1 {
    public static void main (String args[]){
        StringBuilder sb=new StringBuilder("sanat");
        System.out.println(sb);
        //insert the function
        sb.insert(0,'s');
        System.out.println(sb);
        //delete the function
        sb.delete(2,3);
        System.out.println(sb);

    }
    
}
