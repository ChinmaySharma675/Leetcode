// Last updated: 3/7/2026, 10:33:36 PM
class Solution {
    public int dominantIndices(int[] nums) {
        int lsum=0;
        int tsum=0;
            for(int i=0;i<nums.length;i++){
            tsum+=nums[i];
            }
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            lsum+=nums[i];
            int rsum=tsum-lsum;
            if(nums[i]>rsum/(nums.length-i-1)){
                count++;
            }
            
        }
        return count;
        
    }
}