// Last updated: 3/9/2026, 4:24:52 PM
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        int c=0;
4        for(int i=0;i<jewels.length();i++){
5            for(int j=0;j<stones.length();j++){
6                if(jewels.charAt(i)==stones.charAt(j)) {c++;}
7            }
8        }
9        return c;
10    }
11}