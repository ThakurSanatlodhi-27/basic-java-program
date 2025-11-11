import java.util.*;
public class function5 {
    public static int sumOfDig(int n){
        int sum=0;
        while(n>0){
           int lastDig=n%10;
           sum+=lastDig;
           n/=10;
        }System.out.println(sum);
        return sum;
    }
    public static void main(String args[]){
        sumOfDig(565684);
    }
    
}
