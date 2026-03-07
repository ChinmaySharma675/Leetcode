// Last updated: 3/7/2026, 10:33:56 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(z-x)>Math.abs(y-z))return 2;
        else if(Math.abs(z-x)==Math.abs(y-z))return 0;
        else return 1;
    }
}