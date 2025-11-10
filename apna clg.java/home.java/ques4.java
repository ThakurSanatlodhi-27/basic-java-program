import java.util.*;
public class ques4{
    public static double circumfTheCircle(double r){
        double circum=2*Math.PI*r;
        return circum;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        System.out.println(circumfTheCircle(r));
    }
}