// Last updated: 8/9/2026, 6:57:23 PM
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){ //we swap nus[low] and nums[mid] and move both pointers forward.
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;

                low++;
                mid++;
            } else if(nums[mid]==1){//we just move mid pointer forward.
                mid++;
            }else{ //nums[mid]==2, we swwap mid and high and move mid pointer forward and high pointer backward

                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
        
            }
        }
    }
}