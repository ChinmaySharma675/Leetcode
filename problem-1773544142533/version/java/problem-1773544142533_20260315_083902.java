// Last updated: 3/15/2026, 8:39:02 AM
1class Solution {
2    public int countCommas(int n) {
3        int commas=0;
4        for(int i=1;i<=n;i++){
5            int digits=String.valueOf(i).length();
6            commas+=(digits-1)/3;
7        }
8        return commas;
9    }
10}