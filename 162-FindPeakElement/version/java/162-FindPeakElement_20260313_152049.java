// Last updated: 3/13/2026, 3:20:49 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3      int a=nums[0];
4      int j=0;
5      for(int i=0;i<nums.length;i++){
6        if(a<nums[i]){
7            a=nums[i];
8            j=i;}
9
10      }
11      return j;
12    }
13}