// Last updated: 8/9/2026, 6:56:25 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        return xor;
    }
}