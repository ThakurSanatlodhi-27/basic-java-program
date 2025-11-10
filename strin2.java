import java.util.*;
public class strin2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String first="sanat";
        String second="lodhi";
        String fullName=first+" "+second;
        System.out.println(fullName.length());

        //charAt
        for(int i=0;i<fullName.length();i++){
           System.out.println(fullName.charAt(i));
        }


    }
    
}
