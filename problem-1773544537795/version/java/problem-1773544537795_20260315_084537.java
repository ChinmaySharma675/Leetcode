// Last updated: 3/15/2026, 8:45:37 AM
1class Solution {
2    public long countCommas(long n) {
3        long commas=0;
4        for(long start=1;start<=n;start*=10){
5            long end=start*10-1;
6            long right=Math.min(n,end);
7            int digits=String.valueOf(start).length();
8            int c=(digits-1)/3;
9            if(c>0){
10                commas+=(right-start+1)*c;
11            }
12            
13        }
14        return commas;
15    }
16}