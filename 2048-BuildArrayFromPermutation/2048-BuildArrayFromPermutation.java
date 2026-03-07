// Last updated: 3/7/2026, 10:34:51 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }   
        return ans; 
        }
}