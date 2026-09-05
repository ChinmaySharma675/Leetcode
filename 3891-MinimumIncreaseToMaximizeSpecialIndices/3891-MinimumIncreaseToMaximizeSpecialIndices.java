// Last updated: 9/5/2026, 7:27:50 PM
class Solution {
    public long minIncrease(int[] nums) {
        int n = nums.length;
        if (n % 2 == 1) {
            return calc(nums, 1);
        }
        long[] left = new long[n];
        long[] right = new long[n];
        for (int i = 1; i < n - 1; i += 2) {
            int need = Math.max(nums[i - 1], nums[i + 1]) + 1;
            long cost = Math.max(0, need - nums[i]);
            left[i] = cost + (i >= 2 ? left[i - 2] : 0);
        }
        for (int i = n - 2; i >= 1; i -= 2) {
            int need = Math.max(nums[i - 1], nums[i + 1]) + 1;
            long cost = Math.max(0, need - nums[i]);
            right[i] = cost + (i + 2 < n ? right[i + 2] : 0);
        }
        long ans = Long.MAX_VALUE;
        for (int i = 1; i < n; i += 2) {
            long l = (i >= 2 ? left[i - 2] : 0);
            long r = (i + 1 < n ? right[i + 1] : 0);
            ans = Math.min(ans, l + r);
        }
        return ans;
    }

    private long calc(int[] nums, int start) {
        long cost = 0;
        for (int i = start; i < nums.length - 1; i += 2) {
            int need = Math.max(nums[i - 1], nums[i + 1]) + 1;
            cost += Math.max(0, need - nums[i]);
        }
        return cost;
    }
}