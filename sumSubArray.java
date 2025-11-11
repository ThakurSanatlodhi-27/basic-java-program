public class sumSubArray {
    public static void sumSubArray(int nums[]){
        int max=Integer.MIN_VALUE;
        int currentSum=0;
        int start;
        int end;
        for(int i=0;i<nums.length;i++){
            start=i;{
                for(int j=i;j<nums.length;j++){
                     end=j;{
                         currentSum=0;
                        for(int k=start;k<=end;k++){
                            currentSum+= nums [k];
                            
                            

                        }if(max<currentSum){
                            max=currentSum;
                        }
                    }System.out.println("currentsum is "+currentSum);
                }System.out.println();
            }
         }System.out.println("max is "+max);
       

    }
    public static void main(String args[]){
        int nums[]={5,6,4,2,8};
        sumSubArray(nums);

    }
    
}
