// Last updated: 3/7/2026, 10:34:52 PM
class Solution {
    public int maxProductDifference(int[] nums) {
       Arrays.sort(nums);
       int W=nums[nums.length-1];
       int X=nums[nums.length-2];
       int Y=nums[0];
       int Z=nums[1];
        return W*X - Y*Z;
        
    }
}