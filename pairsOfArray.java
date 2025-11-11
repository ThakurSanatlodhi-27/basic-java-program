public class pairsOfArray {
    public static void pair(int nums[]){
        int totalPair=0;
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            for(int j=i+1;j<nums.length;j++){
                System.out.print("("+current+","+nums[j]+")");
                totalPair++;
            }
            System.out.println();
            
        }
        System.out.print("total pair is "+totalPair);
    }
    public static void main(String args[]){
        int nums[]={2,5,8,9,4,1,7,6,3,10};
        pair(nums);
           }
    
}
