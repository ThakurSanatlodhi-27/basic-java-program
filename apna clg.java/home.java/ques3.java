import java.util.*;
public class ques3 {
    //public static void returnGreaterNum(int a,int b){
    //    if(a<b){
    //        System.out.println(b);
    //    }else{
    //        System.out.println(a);
    //    }
    //    
    //}
    //public static void main(String args[]){
    //    Scanner sc=new Scanner(System.in);
    //    int a=sc.nextInt();
    //    int b=sc.nextInt();
    //    returnGreaterNum(a,b);
    //}
    public static int returnGreaterNum(int a,int b){
        if(a<b){
            return b;
        }else{
            return a;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(returnGreaterNum(a,b));
    }
    
}
