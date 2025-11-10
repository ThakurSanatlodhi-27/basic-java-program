import java.util.*;
import java.util.Scanner;
public class sumarray{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        int nums[]=new int[5];
          nums[5]=scanner.nextInt();
        int target=25;
        int san=0;
        for(int i=0;i>=4;i++){
            san=san+i;
            if(san==target){
                System.out.println(i);

            }


        }


    }
}
