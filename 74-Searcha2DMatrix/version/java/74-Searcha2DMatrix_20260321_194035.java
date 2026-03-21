// Last updated: 3/21/2026, 7:40:35 PM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int xor=0;
4        for(int i=0;i<nums.length;i++){
5            xor^=nums[i];
6        }
7        return xor;
8    }
9}