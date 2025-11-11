public class fibRecur {
    public static int fibSeries(int n){
        if(n==0 ||n==1){
           
           return n;
        }
        int fnm1=fibSeries(n-1);
        int fnm2=fibSeries(n-2);
        int fib=fnm1+fnm2;
        
        return fib;
    }
    public static void main(String args[]){
        //int n=5;
        //fibSeries(5);
        System.out.println(fibSeries(4));
    }
    
}
