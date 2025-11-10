import java.util.*;
public class stringmail {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String gmail=sc.next();
    String result="";
    for(int i=0;i<gmail.length();i++){
        if(gmail.charAt(i)=='@'){
            break;
        }else{
            result+=gmail.charAt(i);
        }
        System.out.println(gmail);
    }
}
    
}
