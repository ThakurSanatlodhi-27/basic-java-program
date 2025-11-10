import java.util.*;
public class evenornotfun {
public static int evenOrNot(int n){
    if(n%2==0){
        System.out.println("given number is even");
    }else{
        System.out.println("given number is not even");
    }
    return n;

}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    evenOrNot(n);
}
    
}
