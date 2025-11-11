import java.util.Scanner;
public class sanat1314{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        char gender=sc.nextLine().charAt(0);
        if(gender=='m'||gender=='M'){
            System.out.println("good morning sir");
        }else if(gender=='f'||gender=='F'){
            System.out.println("good morning mam");

        }else{
            System.out.println("given gender is invalid");
        }
    }
}

