// Last updated: 3/7/2026, 10:33:38 PM
class Solution {
    public int minimumPrefixLength(int[] nums) {
        int last=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                last=i+1;               
            }}
        return last;
    }
}