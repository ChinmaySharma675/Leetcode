// Last updated: 3/7/2026, 10:36:25 PM
class Solution {
    public boolean canJump(int[] nums) {
        int maxJump=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxJump){
                return false;
            }
           // else if(maxJump>=nums.length-1) return true;
            maxJump=Math.max(maxJump,i+nums[i]);
        }
        return true;
    }
}