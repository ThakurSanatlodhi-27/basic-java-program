import java.util.*;
public class multiplyfunction {
    public static int multi(int a,int b){
        int product=a*b;
        return product;

    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int product=multi(num1,num2);
        System.out.println(product);
    }
    
}
