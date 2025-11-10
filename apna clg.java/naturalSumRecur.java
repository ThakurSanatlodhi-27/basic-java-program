import java.util.*;
public class naturalSumRecur{
    public static int calSum(int n){
        if(n==1){
            return 1;
        }
        int fnm1=calSum(n-1);
        int fn=n+fnm1;
        return fn;
    }
public static void main(String args[]){
    
    System.out.println(calSum(5));
}
}