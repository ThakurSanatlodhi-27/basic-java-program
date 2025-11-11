import java.util.*;
public class sumOfOddEven {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        for (int i=0;i<=n;i++){
            if(n%i==0){
                evensum+=i;
            }else{
                oddsum+=i;
            }

        }
        System.out.println("even sum of a integer is :"+evensum);
        System.out.println("odd sum of a integer is :"+oddsum);
    }
    
}
