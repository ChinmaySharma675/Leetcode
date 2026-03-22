# Last updated: 3/22/2026, 9:14:22 AM
1class Solution:
2    def minRemovals(self, nums: List[int], target: int) -> int:
3        total_xor=0;
4        for num in nums:
5            total_xor^=num
6            
7        need=total_xor^target
8        if need==0:
9            return 0
10
11        dp={0:0}
12        for num in nums:
13            new_dp=dp.copy()
14            for x,count in dp.items():
15                xor_val=x^num
16                if xor_val not in new_dp or new_dp[xor_val]>count+1:
17                    new_dp[xor_val]=count+1
18            dp=new_dp
19        return dp.get(need,-1)    