# Last updated: 9/5/2026, 7:27:15 PM
class Solution:
    def gcdSum(self, nums: list[int]) -> int:
        prefixGcd=[]
        mx=0

        for x in nums:
            mx=max(mx,x)
            prefixGcd.append(gcd(x,mx))

        prefixGcd.sort()

        ans=0
        l,r=0,len(prefixGcd)-1
        while l<r:
            ans+=gcd(prefixGcd[l],prefixGcd[r])
            l+=1
            r-=1
        return ans