public class subArray {
    public static void subarray(int nums[]){
        int start;
        int end;
        int totalSub=0;
        
        for(int i=0;i<nums.length;i++){
            start=i;
            for(int j=i;j<nums.length;j++){
                end=j;
                
                for(int k=start;k<=end;k++){
                    System.out.print(nums[k]+" ");
                
                }totalSub++;
                System.out.println();
                
                    

            }
            System.out.println(totalSub);
        }
    }
    public static void main(String args[]){
        int nums[]={1,3,5,7,9};
        subarray(nums);


    }
    
}
