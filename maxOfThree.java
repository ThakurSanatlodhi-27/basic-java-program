import java.util.Scanner;
public class maxOfThree {
    public static void main (String args []){
    System.out.println("Enter the number :"); 
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>b && a>c){
        System.out.println("max number is :"+a);
    }else if(b>a && b>c){
        System.out.println("max number is :"+b);
    }else{
        System.out.println("max number is :"+c);
    }
     
    }
    
}
