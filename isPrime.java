import java.util.*;
public class isPrime{
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int div=2;
        while(div<n){
            if(n%div==0){
                System.out.println("num is not prime");
                
                
            }else {
                div=div+1;
            }
            System.out.println("number is prime");


            
        }


    }
}
    

