// Last updated: 8/8/2026, 7:19:12 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int maxJump=0;
4        for(int i=0;i<nums.length;i++){
5            if(i>maxJump){
6                return false;
7            }
8           
9            maxJump=Math.max(maxJump,i+nums[i]);
10        }
11        return true;
12    }
13}