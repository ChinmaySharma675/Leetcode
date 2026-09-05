// Last updated: 9/5/2026, 7:27:35 PM
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