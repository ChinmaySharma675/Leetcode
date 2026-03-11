// Last updated: 3/11/2026, 6:35:24 PM
1class Solution {
2    public int minimumFlips(int n) {
3       String s=Integer.toBinaryString(n);
4       int i=0;
5       int j=s.length()-1;
6       int flips=0;
7       while(i<j){
8        if(s.charAt(i)!=s.charAt(j)) {
9            flips+=2;
10
11        }
12        i++;
13        j--;
14       }
15    return flips;
16    }
17}