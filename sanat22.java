import java.util.Scanner;
public class sanat22 {
    public static void main(String args[]){
        System.out.println("enter the alphabet character");
        Scanner sc=new Scanner(System.in);
        char sanat;
        sanat=sc.nextLine().charAt(0);
        
        if(sanat=='a'||sanat=='e'||sanat=='i'||sanat=='o'||sanat=='u'){
            System.out.println("the alphabet character is vowel");
            
        }else{
            System.out.println("the alphabet is consonent");
        }
    }
    
}
