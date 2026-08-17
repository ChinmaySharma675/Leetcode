// Last updated: 8/17/2026, 8:09:41 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        
4        int[] count = new int[26];
5
6        for(char c: s.toCharArray()){
7            count[c-'a']++;
8        }
9
10        for(int i=0;i<s.length();i++){
11            if(count[s.charAt(i)-'a']==1){
12                return i;
13            }
14        }
15        return -1;
16   }
17}