// public class san {
//     public static int  twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<=nums.length-1;j++){
//                 if(nums[i]+nums[j]==target){
//                     System.out.println("["+i+","+j+"]");
//                 }
//             }
//         }


//        return target; 
//     }
//     public static void main(String args[]){
//         int nums[]={2,7,11,15};
//         int target=9;
//         twoSum(nums,target);
//     }
// }

import java.util.Arrays;

public class san {
    public static int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target ) {
                    return new int[]{i,j};
                }
            
            }
        }
        return new int[]{};
    }
public static void main(String[] args){
   int nums[]= {1,2,3,4};
   int target=5;
   System.out.println(Arrays.toString(twoSum(nums, target)));
}
}