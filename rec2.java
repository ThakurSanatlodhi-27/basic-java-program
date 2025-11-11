public class rec2 {
    static String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void sanat(int n){
        if(n==0){
            return ;
        }
        int lastdig=n%10;
        sanat(n/10);
        System.out.print(arr[lastdig]+" ");
       // return arr[lastdig];
    }
    public static void main(String args[]){
        int n=1456;
        sanat(n);
    }
    
}
