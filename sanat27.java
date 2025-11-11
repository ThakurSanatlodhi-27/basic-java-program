import java.util.Scanner;
public class sanat27{
    public static void main(String args[]){
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if(n>0){
            for(int i=1;i<=n;i++){
                sum=sum+i;}
                
                System.out.println(sum);
                
            
        }else{
            System.out.println("given number is invalid");
        }
    }
}