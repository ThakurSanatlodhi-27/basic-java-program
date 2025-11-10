import java.util.*;
public class logical {
    public static void main(String args[]){
        int a=45;
        int b=89;
        int c=45;
         System.out.println((a>b)||(b>c));
        System.out.println((b<a)||(c>b));
        System.out.println((a<=c)||(b>=a));
        System.out.println((a<b)&&(c<b));
        System.out.println((a>b)&&(a<b));
        System.out.println(!(b<=c));
    }

    
}
