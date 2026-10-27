// Last updated: 10/27/2026, 9:38:23 PM
1class Solution {
2    public void reverseString(char[] s) {
3        int left=0;
4        int right=s.length-1;
5        while(left<right){
6            char al=s[right];
7            s[right]=s[left];
8            s[left]=al;
9            left++;
10            right--;
11        }
12        
13    }
14}