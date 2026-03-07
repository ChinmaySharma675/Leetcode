// Last updated: 3/7/2026, 10:35:16 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningsum = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){

            sum=sum+nums[i];
            runningsum[i]=sum;
        }
        return runningsum;
    }
}