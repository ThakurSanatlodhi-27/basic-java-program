import java.util.Scanner;
public class sanat29 {
    public static void main(String args[]){
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                evensum=evensum+i;
            }else{
                oddsum=oddsum+i;
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
        }
        

    }
    

