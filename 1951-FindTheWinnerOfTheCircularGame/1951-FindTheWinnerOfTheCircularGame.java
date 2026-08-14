// Last updated: 8/14/2026, 3:36:01 PM
class Solution {
    public int findTheWinner(int n, int k) {
        int winner=0;
        for(int size=2;size<=n;size++){
            winner=(winner+k)%size;
        }
        return winner+1;
    }
}