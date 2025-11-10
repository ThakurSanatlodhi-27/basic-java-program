import java.util.*;
public class ques5 {
    public static int eligibleToVote(int age){
        if(age>18){
            System.out.println("eligible for vote");
        }else{
            System.out.println("not eligible for vote" );
        }
        return age;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        eligibleToVote(age);
    }
    
}
