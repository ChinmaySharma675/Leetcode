// Last updated: 8/13/2026, 9:17:15 AM
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if(n<1){
4            return false;
5        }
6        while(n%3==0){
7            n/=3;
8        }
9
10        return n==1;
11    }
12}
13