// Last updated: 8/9/2026, 10:40:25 PM
1class Solution {
2    public int findTheWinner(int n, int k) {
3        int winner=0;
4        for(int size=2;size<=n;size++){
5            winner=(winner+k)%size;
6        }
7        return winner+1;
8    }
9}