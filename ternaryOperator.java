import java.util.*;
public class ternaryOperator {
    public static void main(String args[]){
        int number=5;
        String type=((number%2==0))?"even":"odd";
        System.out.println(type);



        int marks=16;
        String reportcard=((marks>=33))?"PASS":"FAIL";
        System.out.println(reportcard);
    }
    
}
