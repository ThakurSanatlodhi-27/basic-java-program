
public class binomalCofficent {
    public static int factorial(int a){
        int fact=1;
        for (int i=a;i>=1;i--){
            fact*=i;
            
        }
        return fact;

    }
    public static int binoCoff(int n,int r){
        int fact1=factorial(n);
        int fact2=factorial(r);
        int fact3=factorial(n-r);
        int coff=fact1/(fact2*fact3);
        return coff;


    }
    public static void main(String args[]){
        System.out.println(binoCoff(8,3));
    }
    
}
