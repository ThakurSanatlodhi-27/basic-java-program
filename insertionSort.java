import java.util.Collections;
import java.util.Arrays;

public class insertionSort {
    public static void insertSort(Integer arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void printarr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        Integer arr[]={3,5,4,1,2};
        Arrays.sort(arr,Collections.reverseOrder());
    
    
       printarr(arr);
    }
    
    
}
