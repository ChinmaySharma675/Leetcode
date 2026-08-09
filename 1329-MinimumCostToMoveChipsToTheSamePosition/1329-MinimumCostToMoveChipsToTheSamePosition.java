// Last updated: 8/9/2026, 6:55:13 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd=0;
        int even=0;
        for(int num:position){
            if(num%2==0)even++;
            else odd++;
        }
        return Math.min(even,odd);
    }
}