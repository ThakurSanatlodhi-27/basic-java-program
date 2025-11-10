import java.util.*;
public class reverseNum {
    public static void main(String args[]){
        //int n=254896;
        // while(n>0){
        //     System.out.print(n%10);
        //     n=n/10;
        // }
        for(int i=254896; i>0; i=i/10){
            System.out.print(i%10);
        }
    }
    
}
