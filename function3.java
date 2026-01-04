import java.util.*;
public class function3 {
    public static boolean Palindrom(int n){
        int orignal=n;
        int rev=0;
        while(n>0){
            int lastdig=n%10;
            rev=rev*10+lastdig;
            n/=10;
        }
        return orignal==rev;

       
    }
    public static void main(String args[]){
        if(Palindrom(1215)){
            System.out.println("it is a palindrom number");
        }else{
            System.out.println("it is not a palindrom number");
        }
    }
}
    

