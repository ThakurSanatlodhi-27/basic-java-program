public class selectionSort{
    public static void array(int nums[]){
        
        for(int i=0;i<nums.length-1;i++){
            int min=i;
            for(int j=turn+1;j<nums.length;j++){
                if(turn>nums[j]){
                    nums[j]=turn;
                }
                
            }
            int temp=nums[min];
            nums[min]=nums[i];
            min=temp;
            
        }
        
        
    }
    public static void printarray(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }
    public static void main(String args[]){
        int nums[]={8,5,7,3,6,1,2};
        array(nums);
        printarray(nums);
    }
}



