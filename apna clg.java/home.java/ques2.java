import java.util.*;
public class ques2{
    public static int sumOfOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            
            if(i%2!=0){
                sum=sum+i;
                
            }
            System.out.println(sum);
        }
       return sum; 
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sumOfOdd(n);
        
        
    }

}