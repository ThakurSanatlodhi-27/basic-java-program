import java.util.*;
public class reversestring {
    public static void main(String args[]){
        System.out.println("Enter the string : ");
        Scanner scanner=new Scanner(System.in);
        String sanat=scanner.next();
        String ritik="";
        for(int i=0;i<sanat.length();i++){
            char san=sanat.charAt(i);
            ritik=san+ritik;
            
        }
        System.out.println(ritik);
        
    }
    
}
