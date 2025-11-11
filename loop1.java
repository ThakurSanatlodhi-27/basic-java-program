import java.util.*;
public class loop1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int input;
        do{
            int marks=sc.nextInt();
            if(marks>=90){
                System.out.println("this is good");
            }else if(marks>=60){
                System.out.println("this is also good");
            }else if(marks>=0){
                System.out.println("this is good as well");
            }

            else{
                System.out.println("invalid number");

                }
                System.out.println("yes(1)orno(0)");
                 input=sc.nextInt();
            }while(input==1);

            
        }
    }
