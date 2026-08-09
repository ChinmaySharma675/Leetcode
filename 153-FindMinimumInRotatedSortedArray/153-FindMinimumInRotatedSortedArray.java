// Last updated: 8/9/2026, 6:57:14 PM
class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;

            if(nums[mid]>nums[right]){
                left=mid+1;
                
                
            }else{
                right=mid;
                
            }
        }
        return nums[left];
        
    }
}