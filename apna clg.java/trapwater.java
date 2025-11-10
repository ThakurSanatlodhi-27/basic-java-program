public class trapwater {
    public static int trapewater(int hight[]){
        int n=hight.length;
        int trpwater=0;
        //to find my leftmax array
        int leftmax[]=new int[n];
        leftmax[0]=hight[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(hight[i],leftmax[i-1]);
        }
        int rightmax[]=new int[n];
        rightmax[n-1]=hight[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(hight[i],rightmax[i+1]);
        }
        for (int i=0;i<n;i++){
            int waterLevel=Math.min(leftmax[i],rightmax[i]);
            trpwater+=waterLevel-hight[i];

        }
        return trpwater;
        
    }
    public static void main(String args[]){
        int nums[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapewater(nums));


    }
    
}
