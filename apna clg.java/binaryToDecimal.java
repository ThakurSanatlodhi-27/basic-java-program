
public class binaryToDecimal {
    public static void conversion(int n){
        int pow=0;
        int dec=0;
        while(n>0){
           int lastdig=n%10;
           dec=dec+(lastdig*(int)Math.pow(2,pow));
           pow++;
           n=n/10;
           
        }
        System.out.println(dec);
        
    }
    public static void main(String args[]){
        conversion(1111);
    }
    
}
