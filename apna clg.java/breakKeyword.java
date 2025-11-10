import java.util.*;
public class breakKeyword {
    public static void main(String args[]){
        Scanner sca=new Scanner(System.in);
        do{ 
            System.out.println("enter the number");
            int n=sca.nextInt();
            
            if(n%10==0){
                break;
            }

        }while(true);
    }
    
}
