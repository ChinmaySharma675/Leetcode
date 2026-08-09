// Last updated: 8/9/2026, 6:36:59 PM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        Arrays.sort(nums);
4        int expected=1;
5        for(int num:nums){
6            if(num==expected){
7                expected++;
8            }
9        }
10        return expected;
11
12    }
13}