import java.util.*;
public class squrePattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int j=sc.nextInt();
        int k=sc.nextInt();
        for (int i=1;i<=j;i++){
            for(int p=1;p<=k;p++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
