import java.util.*;
public class switc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        //if(button==1){
        //    System.out.println("Hello");
        //}else if(button==2){
        //    System.out.println("Namaste");
        //}else if(button==3) {
        //    System.out.println("Bonjaro");
        //}else{
        //   System.out.println("Invalid butten");
        //}
        switch(button){
            case 1:System.out.println("hello");
            break;
            case 2:System.out.println("namaste");
            break;
            case 3:System.out.println("bonjaro");
            break;
            default:System.out.println("invalid button");
        }
        
    }
}

