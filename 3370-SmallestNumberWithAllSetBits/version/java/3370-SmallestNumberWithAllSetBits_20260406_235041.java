// Last updated: 4/6/2026, 11:50:41 PM
1class Solution {
2    public int smallestNumber(int n) {
3       int a=n;
4       while((a&(a+1))!=0){ //loops break when a&(a+1)==0 which haapens only when a has all sets equal to 1.
5        a++;
6       }
7    return a;
8    }
9}
10