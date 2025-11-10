public class swapXor {
    public static void main(String args[]){
        int x=4;int y=8;
        System.out.println("befor using swap operation  x is "+x+"and y is "+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("after using swap operation x is "+x+"and y is "+y);
    }
    
}
