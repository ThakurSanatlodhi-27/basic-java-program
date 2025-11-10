import java.util.Scanner;
public class sanat19 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0 && year%100!=0|| year%400==0){
            System.out.println("given year is leap year");
        }else{
            System.out.println("given year is not leap year");
        }

    }
    
}
