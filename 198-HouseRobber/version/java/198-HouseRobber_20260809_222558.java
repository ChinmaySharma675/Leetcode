// Last updated: 8/9/2026, 10:25:58 PM
1class Solution {
2    public int rob(int[] nums) {
3        int prev2 = 0; //  - represent max money till house i-2
4        int prev1 = 0; //  - represent max money till house i-1
5
6        for (int num : nums) {
7            int curr = Math.max(prev1, prev2 + num);
8            prev2 = prev1;
9            prev1 = curr;
10        }
11
12        return prev1;
13    }
14}
15