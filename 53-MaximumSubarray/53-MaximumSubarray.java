// Last updated: 3/7/2026, 10:36:27 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int currentsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentsum=Math.max(currentsum+nums[i],nums[i]);
            maxsum=Math.max(currentsum,maxsum);
            
        }
        return maxsum;
    }
}