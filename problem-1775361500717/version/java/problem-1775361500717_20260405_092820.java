// Last updated: 4/5/2026, 9:28:20 AM
1class Solution {
2    public long minIncrease(int[] nums) {
3        int n = nums.length;
4        if (n % 2 == 1) {
5            return calc(nums, 1);
6        }
7        long[] left = new long[n];
8        long[] right = new long[n];
9        for (int i = 1; i < n - 1; i += 2) {
10            int need = Math.max(nums[i - 1], nums[i + 1]) + 1;
11            long cost = Math.max(0, need - nums[i]);
12            left[i] = cost + (i >= 2 ? left[i - 2] : 0);
13        }
14        for (int i = n - 2; i >= 1; i -= 2) {
15            int need = Math.max(nums[i - 1], nums[i + 1]) + 1;
16            long cost = Math.max(0, need - nums[i]);
17            right[i] = cost + (i + 2 < n ? right[i + 2] : 0);
18        }
19        long ans = Long.MAX_VALUE;
20        for (int i = 1; i < n; i += 2) {
21            long l = (i >= 2 ? left[i - 2] : 0);
22            long r = (i + 1 < n ? right[i + 1] : 0);
23            ans = Math.min(ans, l + r);
24        }
25        return ans;
26    }
27
28    private long calc(int[] nums, int start) {
29        long cost = 0;
30        for (int i = start; i < nums.length - 1; i += 2) {
31            int need = Math.max(nums[i - 1], nums[i + 1]) + 1;
32            cost += Math.max(0, need - nums[i]);
33        }
34        return cost;
35    }
36}