// Last updated: 3/29/2026, 8:05:28 AM
1class Solution {
2    public int firstMatchingIndex(String s) {
3        int l=0;
4        int r=s.length()-1;
5        while(l<=r){
6            if(s.charAt(l)==s.charAt(r)) return l;
7            l++;
8            r--;
9        }
10        return -1;
11        
12    }
13}