import java.util.*;
public class strinbuld {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("tony");
        System.out.println(sb);

        System.out.println(sb.charAt(2));
        //set char at index 0
        sb.setCharAt(0,'p'); 
        System.out.println(sb);
        }

    
}
