// Last updated: 3/8/2026, 3:14:14 PM
1class Solution {
2    public int reverseDegree(String s) {
3        int sum=0;
4        int k=0;
5        for(int i=0;i<s.length();i++){
6            k='z'-s.charAt(i)+1;
7            
8            int prod=k*(i+1);
9            sum+=prod;
10        }
11        return sum;
12    }
13}