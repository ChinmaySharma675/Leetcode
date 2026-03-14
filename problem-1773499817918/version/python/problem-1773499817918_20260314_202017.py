# Last updated: 3/14/2026, 8:20:17 PM
1class Solution:
2    def gcdSum(self, nums: list[int]) -> int:
3        prefixGcd=[]
4        mx=0
5
6        for x in nums:
7            mx=max(mx,x)
8            prefixGcd.append(gcd(x,mx))
9
10        prefixGcd.sort()
11
12        ans=0
13        l,r=0,len(prefixGcd)-1
14        while l<r:
15            ans+=gcd(prefixGcd[l],prefixGcd[r])
16            l+=1
17            r-=1
18        return ans