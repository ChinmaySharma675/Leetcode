# Last updated: 8/9/2026, 6:51:36 PM
class Solution:
    def minRemovals(self, nums: List[int], target: int) -> int:
        total_xor=0;
        for num in nums:
            total_xor^=num
            
        need=total_xor^target
        if need==0:
            return 0

        dp={0:0}
        for num in nums:
            new_dp=dp.copy()
            for x,count in dp.items():
                xor_val=x^num
                if xor_val not in new_dp or new_dp[xor_val]>count+1:
                    new_dp[xor_val]=count+1
            dp=new_dp
        return dp.get(need,-1)    