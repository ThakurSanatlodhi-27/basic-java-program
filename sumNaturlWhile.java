import java.util.*;
public class sumNaturlWhile {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        int x=1;
        int sum=0;
        while(x<=range){
            sum+=x;
            //System.out.println(sum);
            x++;
        }System.out.println(sum);
    }
    
}
