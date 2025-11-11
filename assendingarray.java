import java.util.*;
public class assendingarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        boolean assending=true;
        
        for(int i=0;i<number.length-1;i++){
            if(number[i]>number[i+1]){
                assending=false;
                
            }
            if(assending){
                System.out.println("the array is sorted in assending order");
            }else{
                System.out.println("the array is not sorted in assending order" );
            }

        }
}
}
