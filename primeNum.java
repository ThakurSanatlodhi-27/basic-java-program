import java.util.*;
public class primeNum {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(n==2){
            System.out.println("given number is prime");
        }else{
             boolean isprime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isprime=false;
                }
                }if(isprime==true){
                    System.out.println("given number is prime");
                }else{
                    System.out.println("given number is not prime;");
                }



            }
        }
    }
    

