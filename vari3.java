import java.util.*;
public class vari3 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the cost of pensil");
        float pensil=sc.nextFloat();
        System.out.println("enter the cost of pen ");
        float pen=sc.nextFloat();
        System.out.println("enter the cost of an eraser");
        float eraser=sc.nextFloat();
        System.out.println("total cost of itoms is");
        float total=pensil+pen+eraser;
        System.out.println(total);
        float gstTotal=total+(total*0.18f);
        System.out.println("total cost with gst of itom is" + gstTotal);

    }
    
}
