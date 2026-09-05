// Last updated: 9/5/2026, 7:28:36 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(z-x)>Math.abs(y-z))return 2;
        else if(Math.abs(z-x)==Math.abs(y-z))return 0;
        else return 1;
    }
}