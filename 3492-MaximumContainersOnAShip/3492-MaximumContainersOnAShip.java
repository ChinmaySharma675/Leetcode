// Last updated: 9/5/2026, 7:28:39 PM
class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        if(n*n*w < maxWeight) return n*n;
        else return maxWeight/w;
    }
}