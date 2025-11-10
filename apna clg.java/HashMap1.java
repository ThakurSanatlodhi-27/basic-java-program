import java.util.HashMap;
//import java.util.HashSet;
import java.util.*;
public class HashMap1 {
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("india",91);
        hm.put("sagar",15);
        hm.put("bhopal",56);
        hm.put("shreeLanka",9865);

       /*  System.out.println(hm);

        System.out.println(hm.get("india"));
        System.out.println(hm.get("bhopal"));
        System.out.println(hm.get("baroda"));

        System.out.println(hm.containsKey("sagar"));
        System.out.println(hm.containsKey("baroda"));

        System.out.println(hm.remove("bhopal"));
        System.out.println(hm);

        System.out.println(hm.remove("baroda"));
        System.out.println(hm);*/

        //Iterate
        Set<String> ram=hm.keySet();
       System.out.println(ram);

       for(String k:ram){
        System.out.println("key="+k+", value is"+hm.get(k));
       }
        
    }
    
}
