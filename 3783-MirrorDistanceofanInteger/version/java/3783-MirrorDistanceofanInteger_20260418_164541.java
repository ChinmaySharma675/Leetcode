// Last updated: 4/18/2026, 4:45:41 PM
1class Solution {
2    public int mirrorDistance(int n) {
3        int rev=0;
4        int a=n;
5        while(n!=0){
6            rev=rev*10+n%10;
7            n/=10;
8        }
9        return Math.abs(a-rev);
10    }
11}