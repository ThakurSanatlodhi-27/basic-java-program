import java.util.*;
public class condition3 {
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        int weeknumber=sc.nextInt();
        switch(weeknumber){
            case 1:System.out.println("today is sunday");
                   break;
            case 2:System.out.println("today is monday");
                   break;
            case 3:System.out.println("today is tuesday");
                   break;
            case 4:System.out.println("today is wednesday");
                   break;
            case 5:System.out.println("today is thrusday");
                   break;
            case 6:System.out.println("today is friday");
                   break;
            case 7:System.out.println("today is saturday ");
                   break;
            default:System.out.println("you have press invalid key");                                           
        }
    }
    
}
