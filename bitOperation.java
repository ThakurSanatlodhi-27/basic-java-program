public class bitOperation {
    public static int getBit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setBit(int n,int i){
        int bitMask=1<<i;
        return n |bitMask;
    }
    public static int clearBit(int n,int i){
        int bitMask=1<<i;
        return n ^ bitMask;
    }
    public static int clearIbit(int n,int i){
        int bitMask=(-1)<<i;
        return n & bitMask;
    }
    public static int countSetBit(int n){
        int count=0;
        while(n>0){
            if((n & 1) !=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(getBit(6,1));
        System.out.println(setBit(5,1));
        System.out.println(clearBit(2,1));
        System.out.println(clearIbit(15,2));
        System.out.println(countSetBit(3));
    }
    
}
