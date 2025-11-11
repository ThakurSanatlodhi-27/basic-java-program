import java.util.Scanner;
public class sanat16 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String name=sc.next();
        int age=sc.nextInt();
        boolean valid=true;
        boolean invalid=false;
        if(age>=18){
            System.out.println(true+"hello "+name+" you are voter");
        }else{
            System.out.println(false+"hello "+name+" you are not a voter");
        }

        

    }
    
}
