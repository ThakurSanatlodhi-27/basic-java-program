import java.util.*;
public class decToBin {
    public static void conversion(int n){
        int x=0;
        int bin=0;
        int pow=0;
        while(n>0){
            x=n/2;
            bin=bin+(n%2)*(int)Math.pow(10,pow);
            pow++;
            n=x;
            
        }System.out.print(bin);
    }
    
    public static void main(String args[]){
        conversion(4);

    }
    
    
}
