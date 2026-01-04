import java.util.Random;
import java.util.Scanner;
public class RandomCls {
    public static void main (String args[]){
        Random rand=new Random();
        Scanner sc=new Scanner (System.in);
        int r1=rand.nextInt();
        System.out.println(r1);

        int r2=rand.nextInt(50);
        System.out.println(r2);

        double r3=rand.nextDouble();
        System.out.println(r3);

        float r4=rand.nextFloat();
        System.out.println(r4);

        boolean r5=rand.nextBoolean();
        System.out.println(r5);

        //random name pic
        String[] name={"sanat","shivam","sumit","ritik"};
        int index=rand.nextInt(name.length);
        System.out.println(name[index]);


    }
    
}
