// Last updated: 3/7/2026, 10:33:57 PM
class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        if(n*n*w < maxWeight) return n*n;
        else return maxWeight/w;
    }
}