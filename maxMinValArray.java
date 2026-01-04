import java.util.*;
public class maxMinValArray {
    public static int maxMin(int numbers[],int n){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
                return largest;
            }if(smallest>numbers[i]){
                smallest=numbers[i];
            }if(n==numbers[i]){
                System.out.println(i);
            }
            
            

        }
        return largest;
    }
    public static void main(String args[]){
        int number[]={85,65,14,67,91,53};
        int key=91;
        int smallest;
        maxMin(number,key);
        System.out.println();
        
        
        
    }
    
}
