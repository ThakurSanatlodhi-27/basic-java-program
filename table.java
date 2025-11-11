import java.util.*;
public class table {
    public static int table(int n){
        for(int i=1;i<=10;i++){
            
            System.out.println(n*i);
        }
        return n;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         table(n);
    }
    
}
