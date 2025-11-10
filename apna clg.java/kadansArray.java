public class kadansArray {
    public static void ardens(int nums[]){
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cursum+=nums[i];
            if(cursum<0){
                cursum=0;
                
            }
            maxsum=Math.max(maxsum,cursum);
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        int nums[]={5,-2,1,-4,2};
        ardens(nums);


    }
    
}
