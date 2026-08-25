// Last updated: 8/25/2026, 11:08:58 PM
1class Solution {
2    public boolean predictTheWinner(int[] nums) {
3        return solve(nums,0,nums.length-1)>=0;
4        
5    }
6    public int solve(int[] nums,int left,int right){
7        if(left==right){
8        return nums[left];
9        }
10        int takeleft=nums[left]-solve(nums,left+1,right);
11        int takeright=nums[right]-solve(nums,left,right-1);
12
13        return Math.max(takeleft,takeright);
14
15    }
16}