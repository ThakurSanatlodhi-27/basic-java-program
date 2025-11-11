import java.util.*;
public class function2 {
    public static boolean isEven(int n){
        
        if(n%2==0){
             return true;
        }else{
             return false;
        }
        
    }
    public static void main(String args[]){
        
        if(isEven(5)){
            System.out.println("the number is even");
            
        }else{
            System.out.println("the number is odd");
        }

    } 
    
}
