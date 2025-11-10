import java.util.Scanner;
public class sanat25{
    public static void main(String args[]){
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            for(int i=n;i>=1;i--){
                System.out.println(i);
            }
        }else{
            System.out.println("given number is invalid");
        }
    }
}
    

