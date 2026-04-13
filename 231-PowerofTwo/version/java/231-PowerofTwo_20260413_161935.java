// Last updated: 4/13/2026, 4:19:35 PM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3       if(n<1)return false;
4       return (n & (n-1))==0;
5}
6}