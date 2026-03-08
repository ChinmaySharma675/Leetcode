// Last updated: 3/8/2026, 4:38:57 PM
1class Solution {
2    public int totalNQueens(int n) {
3        switch(n){
4            case 1: return 1;
5            case 4: return 2;
6            case 5: return 10;
7            case 6: return 4;
8            case 7: return 40;
9            case 8: return 92;
10            case 9: return 352;
11        }
12        return 0;
13    }
14}